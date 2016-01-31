//设A和B是两个单链表（带头结点），其中元素按递增有序。设计一个算法从A和B中公共元素产生单链表C，要求不破坏A，B的结点
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList CreatNew(LNode*,LNode*,LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
    LNode *head1;
    head1=(LNode*)malloc(sizeof(LNode));
    head1->next=NULL;
    head1=CreatList(head1);

    LNode *head2;
    head2=(LNode*)malloc(sizeof(LNode));
    head2->next=NULL;
    head2=CreatList(head2);

    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head=CreatNew(head1, head2, head);

    Print(head1);
    Print(head2);
    Print(head);

    return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode* head)
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
    return head;
}
//查找公共结点
LinkList CreatNew(LNode *head1, LNode *head2, LNode *head)
{
    LNode *p=head1->next;
    LNode *q=head2->next;
    LNode *r=head;
    LNode *L;
    while(p&&q){
        if(p->data==q->data){
            L=(LNode*)malloc(sizeof(LNode));
            L->data=p->data;
            r->next=L;
            r=L;
            p=p->next;
            q=q->next;
        }else if(p->data<q->data){
            p=p->next;
        }else{
            q=q->next;
        }
    }
    r->next=NULL;
    return head;
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
