//给定一个带表头结点的单链表，试写出算法：按递减次序输出单链表中各结点的数据元素，并释放结点所占的存储空间（要求：不允许使用数组作为辅助空间）
#include<stdio.h>
#include<stdlib.h>

typedef int ElemType;
typedef struct LNode{
    ElemType data;
    struct LNode *next;
}LNode, *LinkList;

LinkList CreatList(LNode*);
void DownPrint(LNode*);

int main(int argc, char* argv[])
{
    LNode *head;
    head=(LNode*)malloc(sizeof(LNode));
    head->next=NULL;
    head=CreatList(head);
    //循环查找剩余链表中最大值结点
    while(head->next!=NULL){
        DownPrint(head);
    }

    printf("\n");
    return 0;
}
//头插法创建单链表
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
//查找最大值结点，然后打印最大值结点，最后删除最大值结点
void DownPrint(LNode *head)
{
    LNode *pre=head;
    LNode *p=head->next;
    LNode *premax=head;
    LNode *max=head->next;
    while(p){
        if(max->data<p->data){
            premax=pre;
            max=p;
        }
        pre=p;
        p=p->next;
    }

    printf("%4d",max->data);

    if(max->next==NULL){
        premax->next=NULL;
        free(max);
    }else{
        premax->next=max->next;
        free(max);
    }
}
