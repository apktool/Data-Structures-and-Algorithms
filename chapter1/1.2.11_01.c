//试编写在带头结点的单链表就地逆置，所谓“就地”是指辅助空间为O(1)
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
void RverList(LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head->next=NULL;

    head=CreatList(head);
    Print(head);
    RverList(head);
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
//就地逆置单链表
void RverList(LNode *head){
    LNode *p=head->next;
    LNode *q=p->next;
    head->next=NULL;
    while(p){
        q=p->next;
        p->next=head->next;
        head->next=p;
        p=q;
    }
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
