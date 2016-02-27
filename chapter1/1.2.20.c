#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList(LNode*);
LinkList Connect(LNode*, LNode*);
LNode* FindRear(LNode*);
void Print(LNode*);

int main(int argc,char* argv[])
{
	LNode *head1;
	head1=(LNode*)malloc(sizeof(LNode));
	head1=CreatList(head1);

	LNode *head2;
	head2=(LNode*)malloc(sizeof(LNode));
	head2=CreatList(head2);

	Print(head1);
	Print(head2);

	head1=Connect(head1, head2);

	Print(head1);
	
	return 0;
}
//尾插法建立循环单链表
LinkList CreatList(LNode *head)
{
	LNode *L;
	LNode *r=head;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		L=(LNode*)malloc(sizeof(LNode));
		L->data=x;
		r->next=L;
		r=L;
		scanf("%d",&x);
	}
	r->next=head;
	return head;
}
//连接两个不同的循环单链表
LinkList Connect(LNode *head1, LNode *head2)
{
	LNode *r1=FindRear(head1);
	LNode *r2=FindRear(head2);
	LNode *p=head2->next;

	r1->next=p;
	free(head2);
	r2->next=head1;

	return head1;
}
//寻找最后一个结点
LNode* FindRear(LNode *head)
{
	LNode *p=head->next;
	while(p->next!=head){
		p=p->next;	
	}
	return p;
}
//打印全部结点
void Print(LNode *head)
{
	LNode *p=head->next;
	while(p!=head){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
