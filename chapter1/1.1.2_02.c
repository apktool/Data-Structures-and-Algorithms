//长度为n的顺序表L，编写一个时间复杂度为O(n)，空间复杂度为O(1)的算法，该算法删除线性表中所有值为e的数据元素
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;
typedef struct{
    ElemType data[MaxSize];
    int length;
}SqList;
void DelX(SqList *, ElemType);
void Print(SqList *);
int main(int argc, char* argv[])
{
    SqList SL;
    SL.length=10;
    for(int i=0;i<SL.length;i++){
        SL.data[i]=2*i+1;
    }
    ElemType e=5;
    Print(&SL);
    DelX(&SL, e);
    Print(&SL);
    return 0;
}
void DelX(SqList *L, ElemType e)
{
    int k=0, i=0;
    while(i<L->length){
        if(L->data[i]==e){
            k++;
        }else{
            L->data[i-k]=L->data[i];
        }
        i++;
    }
    L->length=L->length-k;
}
void Print(SqList *L)
{
    for(int i=0;i<L->length;i++){
        printf("%d\t",L->data[i]);
    }
    printf("\n");
}
