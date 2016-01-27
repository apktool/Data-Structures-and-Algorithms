//设L为带头结点的单链表，编写算法实现从尾到头反向输出每个结点的值。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList Reverse(LNode*);
void Print(LNode*);

int main(int argc,char* argv[])
{
    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head->next=NULL;
    head=CreatList(head);
    Print(head);

    head=Reverse(head);
    Print(head);

    return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode *head)
{
    LNode *s,*r=head;
    ElemType x;
    scanf("%d",&x);
    while(x!=999){
        s=(LNode*)malloc(sizeof(LNode));
        s->data=x;
        r->next=s;
        r=s;
        scanf("%d",&x);
    }
    r->next=NULL;
    return head;
}
//反转结点
LinkList Reverse(LNode *head){
    LNode *p=head->next;
    LNode *q=p;

    head->next=NULL;
    while(p){
        q=q->next;
        p->next=NULL;
        p->next=head->next;
        head->next=p;
        p=q;
    }
    return head;
}
//打印所有结点
void Print(LNode *head){
    LNode *p=head->next;
    while(p){
        printf("%4d",p->data);
        p=p->next;
    }
    printf("\n");
}
