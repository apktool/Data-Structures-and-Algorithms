//给定两个单链表，编写算法找出两个链表的共同结点
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LNode* FindCommon(LNode*,LNode*);
int ListLength(LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
    LNode *head1;
    head1=(LNode*)malloc(sizeof(LNode));
    head1->next=NULL;
    head1=CreatList(head1);
    printf("Head1: ");
    Print(head1);

    int i=4;
    LNode *p=head1;
    while(i--){
        p=p->next;
    }

    LNode *head2;
    head2=(LNode*)malloc(sizeof(LNode));
    head2=CreatList(head2);

    LNode *r=head2->next;
    while(r->next){
        r=r->next;
    }
    r->next=p;

    printf("head2: ");
    Print(head2);

    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head->next=NULL;
    head->next=FindCommon(head1, head2);
    printf("head:  ");
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
//寻找公共结点
LNode* FindCommon(LNode* head1, LNode* head2)
{
    int len1=ListLength(head1);
    int len2=ListLength(head2);
    int len;
    LNode *LongPoint;
    LNode *ShortPoint;
    if(len1>len2){
        len=len1-len2;
        LongPoint=head1->next;
        ShortPoint=head2->next;
    }else{
        len=len2-len1;
        LongPoint=head2->next;
        ShortPoint=head1->next;
    }
    while(len--){
        LongPoint=LongPoint->next;
    }
    while(LongPoint!=NULL){
        if(LongPoint==ShortPoint){
            return LongPoint;
        }
        else{
            LongPoint=LongPoint->next;
            ShortPoint=ShortPoint->next;
        }
    }
    return NULL;

}
//求单链表长度
int ListLength(LNode *head)
{
    LNode *p=head;
    int count=0;
    while(p){
        ++count;
        p=p->next;
    }
    return count;
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
