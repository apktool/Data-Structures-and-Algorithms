//已知两个链表A和B分别表示两个集合，其元素递增排列。编写函数，求A与B的交集，并存放于A链表中。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList Intersection(LNode*,LNode*);
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

	head1=Intersection(head1, head2);

	Print(head1);
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
//查找数据域的值相同的结点
LinkList Intersection(LNode *head1, LNode *head2)
{
	LNode *prep=head1;
	LNode *p=head1->next;
	LNode *q=head2->next;
	while(p&&q){
		if(p->data==q->data){
			prep=p;
			p=p->next;
			q=q->next;
		}else if(p->data<q->data){
			prep->next=p->next;
			free(p);
			p=prep->next;
		}else{
			q=q->next;
		}
	}
	while(p){
		prep->next=p->next;
		free(p);
		p=prep->next;
	}
	return head1;
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
