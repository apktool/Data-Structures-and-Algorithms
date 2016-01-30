//有一个带头结点的单链表对其排序，使之递增有序。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LNode* FindMin(LNode*);
void SelctionSort(LNode*, LNode*);
void Print(LNode*);

int main(int argc,char* argv[])
{
	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head->next=NULL;

	head=CreatList(head);
	Print(head);
	
	LNode *premin=NULL;
	LNode *r=head;

	while(r){
		premin=FindMin(r);
		SelctionSort(r, premin);
		r=r->next;
	}
	Print(head);
	return 0;
}
//头插法建立单链表
LinkList CreatList(LNode *head)
{
	LNode *L;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		L=(LNode*)malloc(sizeof(LNode));
		L->data=x;

		L->next=head->next;
		head->next=L;

		scanf("%d",&x);
	}
	return head;
}
//查找最小值
LNode* FindMin(LNode* head)
{
	LNode *pre=head;
	LNode *premin=head;
	LNode *p=head->next;
	LNode *min=head->next;
	while(p){
		if(p->data<min->data){
			min=p;
			premin=pre;
		}
		pre=p;
		p=p->next;
	}
	return premin;
}
//选择排序
void SelctionSort(LNode *rear, LNode *premin)
{
	LNode *min=premin->next;
	if(min==NULL){
		return;
	}
	premin->next=min->next;
	min->next=rear->next;
	rear->next=min;
}
//打印全部结点
void Print(LNode *head){
	LNode *p=head->next;
	while(p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
