//设头指针为L的带有表头结点的非循环双向链表，其每个结点中除有prior（前驱指针），data（数据），next（后继指针）域外，还有一个访问频度域freq。在链表被启用前，其值均初始化为零。每当在连表中进行一次Locate(L,x)运算时，令元素值为x的结点中freq域的值增1，并使此链表中结点保持按访问频度非递增的顺序排列，同时最近访问的结点排在频度相同的结点的前面，以便使频繁访问的结点总是靠近表头。试编写符合上述要求的Locate(L,x)运算的算法，该运算为函数过程，返回找到结点的地址，类型为指针型。

#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct DNode{
	int freq;
	ElemType data;
	struct DNode *prior,*next;
}DNode,*DLinkList;

DLinkList CreatList(DNode*);
void Locate(DNode*,ElemType);
void BackPrint(DNode*);

int main(int argc,char* argv[])
{
	DNode *head;
	head=(DNode*)malloc(sizeof(DNode));
	head->prior=NULL;
	head->next=NULL;
	head=CreatList(head);
	BackPrint(head);
	//模拟结点数据域的值出现的次数
	for(ElemType x=1;x<=8;x++){
		if(x%2==0){
			Locate(head,x);
			if(x%3==0){
				Locate(head,x);
			}
		}
	}
	BackPrint(head);
	return 0;
}
//头插法建立非循环双向链表
DLinkList CreatList(DNode *head)
{
	DNode *L;
	int freq=0;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		L=(DNode*)malloc(sizeof(DNode));
		L->freq=freq;
		L->data=x;
		
		L->next=head->next;
		if(head->next){
			head->next->prior=L;
		}
		L->prior=head;
		head->next=L;

		scanf("%d",&x);
	}
	return head;
}

void Locate(DNode *head, ElemType x)
{
	DNode *pre=head;
	DNode *p=head->next;
	while(p&&p->data!=x){
		p=p->next;
	}
	if(!p){
		printf("The %d isn't exist!\n",x);
		return;
	}else{
		p->freq++;
		if(p->next){
			p->next->prior=p->prior;
		}
		p->prior->next=p->next;
		pre=p->prior;
		while(pre!=head&&pre->freq<p->freq){
			pre=pre->prior;
		}
		p->next=pre->next;
		pre->next->prior=p;
		p->prior=pre;
		pre->next=p;
	}
}

void BackPrint(DNode *head)
{
	DNode *p=head;
	while(p->next){
		p=p->next;
		printf("%4d|%d",p->data,p->freq);
	}
	printf("\n");
}
