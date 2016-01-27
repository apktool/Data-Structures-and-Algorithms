//在一个递增有序的单链表中，有数据相同的结点存在。试设计一个算法，删除数值相同的结点，使表中不再有重复的结点。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
void DelRrepeat(LNode*);
void Print(LNode*);

int main(int argc,char* argv[])
{
    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head->next=NULL;
    head=CreatList(head);
    Print(head);

    DelRrepeat(head);

    Print(head);
    return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode *head)
{
    LNode *r=head;
    LNode *s;
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
//查找并删除重复值
void DelRrepeat(LNode *head)
{
    LNode *pre=head;
    LNode *p=head->next;
    while(p){
        while(pre->data==p->data){
            pre->next=p->next;
            free(p);
            p=pre->next;
        }
        pre=p;
        p=p->next;
    }
}
//打印所结点
void Print(LNode *head)
{
    LNode *p=head->next;
    while(p){
        printf("%4d",p->data);
        p=p->next;
    }
    printf("\n");
}
