//长度为n的顺序表L，编写一个时间复杂度为O(n)，空间复杂度为O(1)的算法，该算法删除线性表中所有值为e的数据元素
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
    ElemType data[MaxSize];
    int length;
}SqList;

int DelX(SqList *, ElemType);
void Print(SqList *);

int main(int argc, char* argv[])
{
    SqList SL;
    SL.length=10;
    for(int i=0;i<SL.length;i++){
        SL.data[i]=2*i+1;
    }
    ElemType e=5;

    int flag;
    Print(&SL);
    flag=DelX(&SL, e);
    Print(&SL);


    if(flag==0){
        printf("Delete Success!\n");
    }else{
        printf("Find not the number!\n");
    }

    return 0;
}

int DelX(SqList *L, ElemType e)
{
    int k=0, i;
    for(i=0;i<L->length;i++){
        if(L->data[i]!=e){
            L->data[k++]=L->data[i];
        }
    }
    if(L->length==k){
        return -1;
    }else{
        L->length=k;
        return 0;
    }
}

void Print(SqList *L)
{
    for(int i=0;i<L->length;i++){
        printf("%d\t",L->data[i]);
    }
    printf("\n");
}
