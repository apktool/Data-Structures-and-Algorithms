//设计一算法用于判断带头结点的循环双链表是否对称
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct DNode{
	ElemType data;
	struct DNode *prior,*next;
}DNode, *DLinkList;

DLinkList CreatList(DNode*);
int JudgeSym(DNode*);
void BackPrint(DNode*);
void ForwardPrint(DNode*);

int main(int argc,char* argv[])
{
	DNode *head;
	head=(DNode*)malloc(sizeof(DNode));
	head->next=head;
	head->prior=head;
	head=CreatList(head);

	BackPrint(head);
	ForwardPrint(head);

	int flag=JudgeSym(head);
	if(flag==0){
		printf("It is symmery!\n");
	}else{
		printf("It isn't symmery!\n");
	}
	return 0;
}
//尾插法建立循环双链表
DLinkList CreatList(DNode* head)
{
	DNode *r=head;
	DNode *L;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		L=(DNode*)malloc(sizeof(DNode));
		L->data=x;

		L->next=head;
		head->prior=L;
		r->next=L;
		L->prior=r;

		r=L;
		scanf("%d",&x);
	}

	return head;
}
//判断是否对称，若对称，返回0；否则返回-1。
int JudgeSym(DNode *head)
{
	DNode *p=head->next;
	DNode *q=head->prior;
	while(p!=q&&q->next!=p){
		if(p->data==q->data){
			p=p->next;
			q=q->prior;
		}else{
			break;
		}
	}
	if(p==q){
		return 0;
	}else{
		return -1;
	}
}
//向后遍历输出所有结点
void BackPrint(DNode *head)
{
	DNode *p=head->next;
	while(p!=head){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
//向前遍历输出所有结点
void ForwardPrint(DNode* head)
{
	DNode *p=head->prior;
	while(p!=head){
		printf("%4d",p->data);
		p=p->prior;
	}
	printf("\n");
}
