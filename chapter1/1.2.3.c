//试编写在带头结点的单链表L中删除一个最小值结点的高效算法（假设最小值结点是唯一的）。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList(LNode*);
void DelMin(LNode*);
void Print(LNode*);


int main(int argc, char* argv[])
{
	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head->next=NULL;

	head=CreatList(head);
	Print(head);
	DelMin(head);
	Print(head);

	return 0;
}
//头插法创建单链表
LinkList CreatList(LNode *head)
{
	LNode *s;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		s=(LNode*)malloc(sizeof(LNode));
		s->data=x;

		s->next=head->next;
		head->next=s;
		
		scanf("%d",&x);
	}
	return head;
}
//查找并删除最小值结点
void DelMin(LNode *head)
{
	LNode *pre=head,*p=head->next;
	LNode *premin=pre,*min=p;
	while(p){
		if(min->data>p->data){
			premin=pre;
			min=p;
		}
		pre=p;
		p=p->next;
	}
	printf("Deleted Node: %4d\n",min->data);
	premin->next=min->next;
	free(min);
}
//打印所有结点
void Print(LNode *head)
{
	LNode *p=head->next;
	while(p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
