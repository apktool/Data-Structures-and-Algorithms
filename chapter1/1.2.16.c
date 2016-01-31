//假设有两个按元素值递增次序排列的线性表，均以单链表形式存储。试编写算法将这两个单链表归并为一个按元素值递减次序排列的单链表，并要求利用原来的两个单链表结点存放归并后的单链表。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList MergeList(LNode*, LNode*, LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
	LNode *head1;
	head1=(LNode*)malloc(sizeof(LNode));
	head1=CreatList(head1);

	LNode *head2;
	head2=(LNode*)malloc(sizeof(LNode));
	head2=CreatList(head2);

	Print(head1);
	Print(head2);

	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head=MergeList(head1, head2, head);

	Print(head);
	
	return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode *head)
{
	LNode *r=head;
	LNode *L;
	ElemType x;
	scanf("%d",&x);
	while(x!=999){
		L=(LNode*)malloc(sizeof(LNode));
		L->data=x;
		r->next=L;
		r=L;
		scanf("%d",&x);
	}
	r->next=NULL;
	return head;
}
//归并单链表
LinkList MergeList(LNode *head1, LNode *head2, LNode *head)
{
	LNode *prep=head1;
	LNode *p=head1->next;
	LNode *preq=head2;
	LNode *q=head2->next;

	while(p&&q){
		if(p->data<q->data){
			prep->next=p->next;
			p->next=head->next;
			head->next=p;
			p=prep->next;
		}else{
			preq->next=q->next;
			q->next=head->next;
			head->next=q;
			q=preq->next;
		}
	}
	
	while(p){
		prep->next=p->next;
		p->next=head->next;
		head->next=p;
		p=prep->next;
	}
	while(q){
		preq->next=q->next;
		q->next=head->next;
		head->next=q;
		q=preq->next;
	}
	
	free(head1);
	free(head2);

	return head;
}
//打印全部结点
void Print(LNode* head)
{
	LNode *p=head->next;
	while(p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
