//试写一算法来判断单链表的前n个字符是否中心对称
#include<stdio.h>
#include<stdlib.h>
typedef char ElemType;
typedef struct LNode{
	ElemType data;
	struct LNode *next;
}LNode,*LinkList;

LinkList CreatList(LNode*);
int JudgeSym(LNode*,int);
void Print(LNode*);

int main(int argc,char* argv[])
{
	LNode *head;
	head=(LNode*)malloc(sizeof(LNode));
	head=CreatList(head);
	Print(head);

	int flag;
	int n=5;
	flag=JudgeSym(head,n);
	if(flag){
		printf("The link is not symmetery before %d charactor!\n",n);
	}else{
		printf("The link is symmetery before %d charachtor!\n",n);
	}
	return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode* head)
{
	LNode *L;
	LNode *r=head;
	ElemType x;
	scanf("%c",&x);
	while(x!='\n'){
		L=(LNode*)malloc(sizeof(LNode));
		L->data=x;
		r->next=L;
		r=L;
		scanf("%c",&x);
	}
	return head;
}
//判断中心对称
int JudgeSym(LNode* head,int n)
{
	LNode *p=head->next;
	char s[n/2];
	int i;
	for(i=0;i<n/2;i++){
		s[i]=p->data;
		p=p->next;
	}
	i--;
	if(n%2){
		p=p->next;	
	}
	while(p&&p->data==s[i]){
		p=p->next;
		i--;
	}
	if(i==-1){
		return 0;
	}else{
		return -1;
	}
}
//打印全部结点
void Print(LNode *head)
{
	LNode *p=head->next;
	while(p){
		printf("%4c",p->data);
		p=p->next;
	}
	printf("\n");
}
