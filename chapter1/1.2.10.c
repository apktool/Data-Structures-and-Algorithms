//已知一个带有头结点的单链表，在不改变链表的前提下，请设计一个尽可能高效的算法，查找链表中倒数第k个位置上的结点。若查找成功，算法输出该结点的data域的值。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList(LNode*);
LNode* FindReK(LNode*, int);
void Print(LNode*);

int main(int argc,char* argv[])
{
	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head=CreatList(head);
	Print(head);

	int k=3;
	LNode *p;
	p=FindReK(head,k);
	if(p)
		printf("The number is %d in the Reverse postion %dth\n",p->data,k);
	else
		printf("It not find the number!\n");
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
//查找倒数第k个结点
LNode* FindReK(LNode *head, int k)
{
	LNode *q=head->next;
	LNode *p=head->next;
	while(q){
		if(k){
			q=q->next;
			--k;
		}else{
			p=p->next;
			q=q->next;
		}
	}
	return p;
}
//打印全部结点
void Print(LNode *head)
{
	LNode *p=head->next;
	while(p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
