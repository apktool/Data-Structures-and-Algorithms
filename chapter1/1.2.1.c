//设计一个递归算法，删除不带头节点的单链表L中所有值为x的结点。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList();
void DelNodeX(LNode*,ElemType);
void Print(LNode*);

int main(int argc,char* argv[])
{
	ElemType e=3;

	LNode *p;
	p=CreatList();
	Print(p);
	DelNodeX(p,e);
	Print(p);
	return 0;
}
//尾插法建立单链表
LinkList CreatList()
{
	LNode *p;
	LNode *s;
	ElemType x;
	scanf("%d",&x);
	p=(LNode*)malloc(sizeof(LNode));
	p->data=x;
	LNode *r=p;
	while(1){
		scanf("%d",&x);
		if(x==999){
			break;
		}
		s=(LNode*)malloc(sizeof(LNode));
		s->data=x;
		r->next=s;
		r=s;
	}
	r->next=NULL;	
	return p;
}
//删除指定节点
void DelNodeX(LNode *p, ElemType x)
{
	if(p==NULL){
		return;
	}

	LNode*	q=p->next;
	if(p->data==x){
		if(q!=NULL){
			p->data=q->data;
			p->next=q->next;
		}else{
			p=NULL;
		}
		free(q);
		DelNodeX(p,x);
	}else{
		DelNodeX(p->next,x);
	}
}
//打印所有节点
void Print(LNode *p)
{
	while(p){
		printf("%4d",p->data);
		p=p->next;
	}
	printf("\n");
}
