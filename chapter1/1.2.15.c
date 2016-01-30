//设C={a1,b1,a2,b2,...,an,bn}为线性表，采用带头结点的hc单链表存放，设计一个就地算法，将其拆分为两个线性表，使得A={a1,a2,a3,...an}，B={bn,...,b2,b1}。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    int num;
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList SeparateList(LNode*);
int LengthList(LNode*);
void Print(LNode*);

int main(int argc,char *argv[])
{
    LNode *hc;
    hc=(LNode*)malloc(sizeof(LNode));
    hc->next=NULL;
    hc->num=0;
    hc=CreatList(hc);
    Print(hc);

    LNode *ha;
    LNode *hb;
    hb=SeparateList(hc);
    ha=hc;
    Print(ha);
    Print(hb);
}
//尾插法建立单链表
LinkList CreatList(LNode* head)
{
    LNode *r=head;
    LNode *L;
    ElemType x;
    int i=1;
    scanf("%d",&x);
    while(x!=999){
        L=(LNode*)malloc(sizeof(LNode));
        L->num=i++;
        L->data=x;
        r->next=L;
        r=L;
        scanf("%d",&x);
    }
    r->next=NULL;
    return  head;
}
//分离单链表
LinkList SeparateList(LNode* head)
{
    LNode *hb;
    hb=(LNode*)malloc(sizeof(LNode));
    LNode *pre=head;
    LNode *p=head->next;

    while(p){
        if(p->num%2==0){
            pre->next=p->next;
            p->next=hb->next;
            hb->next=p;
            p=pre->next;
        }else{
            pre=p;
            p=p->next;
        }
    }
    return hb;
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
