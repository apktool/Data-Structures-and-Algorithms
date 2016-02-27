//设有一个带头结点的循环单链表，其结点值均为正整数。设计一个算法，反复找出单链表中结点值的最小的结点并输出，然后将该结点从中删除，直到单链表空为止，最后删除头结点
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList(LNode *);
LinkList FindMin(LNode*);
void DelMin(LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head->next=head;
	head=CreatList(head);
	Print(head);
	LNode *pre=head;
	while(head->next!=head){
		pre=FindMin(head);
		DelMin(pre);
	}
	Print(head);
	free(head);
	return 0;
}
//头插法建立单链表
LinkList CreatList(LNode* head)
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
//查找最小值结点
LinkList FindMin(LNode *head)
{
	LNode *pre=head;
	LNode *p=head->next;
	LNode *premin=head;
	LNode *min=head->next;
	while(p!=head){
		if(min->data>p->data){
			premin=pre;
			min=p;
		}	
		pre=p;
		p=p->next;	
	}
	printf("%4d",min->data);
	return premin;
}
//删除最小值结点
void DelMin(LNode *pre)
{
	LNode *p=pre->next;
	pre->next=p->next;
	free(p);
}
//打印所有结点
void Print(LNode *head)
{
	LNode *p=head->next;
	while(head!=p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
