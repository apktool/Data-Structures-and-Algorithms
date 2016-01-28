//将一个带头结点的单链表分解为两个带头结点的单链表A和B，使得A表中含有原表中序号为奇数的元素，而B表中含有元表中序号为偶数的元素，且保持其相对顺序不变。
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    int num;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
LinkList SeparateList(LNode*);
void Print(LNode*);

int main(int argc, char* argv[])
{
    LNode *head1;
    head1=(LNode*)malloc(sizeof(LNode));
    head1->next=NULL;

    head1=CreatList(head1);
    printf("head :");
    Print(head1);

    LNode *head2;
    head2=SeparateList(head1);


    printf("head1:");
    Print(head1);
    printf("head2:");
    Print(head2);
    return 0;
}
//尾插法建立单链表
LinkList CreatList(LNode* head)
{
    int cnt=1;
    LNode *r=head;
    LNode *s;
    ElemType x;
    scanf("%d",&x);
    while(x!=999){
        s=(LNode*)malloc(sizeof(LNode));
        s->data=x;
        s->num=cnt++;
        r->next=s;
        r=s;
        scanf("%d",&x);
    }
    r->next=NULL;
    return head;
}
//拆分单链表
LinkList SeparateList(LNode *head1)
{
    LNode *head2;
    head2=(LNode*)malloc(sizeof(LNode));
    LNode *r=head2;
    LNode *pre=head1;
    LNode *p=pre->next;
    while(p){
        if(p->num%2){
            pre=p;
            p=p->next;
        }else{
            pre->next=p->next;
            r->next=p;
            r=p;
            p=pre->next;
        }
    }
    r->next=NULL;
    return head2;
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
