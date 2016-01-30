//两个整数序列A=a1,a2,a3,...,am和B=b1,b2,b3,...,bn已经存入两个单链表中，设计一个算法，判断序列B是否是序列A的连续子序列。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
int FindSub(LNode*, LNode*);
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

    Print(head1);
    Print(head2);

    int flag;
    flag=FindSub(head1, head2);
    if(flag==0){
        printf("B is subsquence of A!\n");
    }else{
        printf("B isn't subsquence of A!\n");
    }

    return 0;
}
//头插法建立单链表
LinkList CreatList(LNode* head)
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
//判断单链表B是否为单链表A的子序列。若是则返回0，若不是则返回-1；
int FindSub(LNode* head1, LNode* head2)
{
    LNode *pre=head1;
    LNode *p=head1->next;
    LNode *q=head2->next;
    while(p&&q){
        if(p->data==q->data){
            p=p->next;
            q=q->next;
        }
        else{
            pre=pre->next;
            p=pre;
            q=head2->next;
        }
    }
    if(q==NULL){
        return 0;
    }
    return -1;
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
