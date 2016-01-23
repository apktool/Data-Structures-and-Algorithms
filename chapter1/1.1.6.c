//设计一个高效的算法，将顺序表的所有元素逆置，要求算法的空间复杂度为O(1)。
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
    ElemType data[MaxSize];
    int length;
}SqList;

int Reverse(SqList *);
void Print(SqList *);

int main(int argc, char* argv[])
{
    SqList SL;
    SL.length=10;
    for(int i=0;i<SL.length;i++){
        SL.data[i]=i;
    }

    int flag;
    Print(&SL);
    flag=Reverse(&SL);
    Print(&SL);

    if(flag==0){
        printf("Success! \n");
    }else{
        printf("Illege! \n");
    }
    return 0;
}


int Reverse(SqList *s)
{
    ElemType temp;
    if(s->length==0){
        printf("illegal!\n");
        return -1;
    }
    for(int i=0;i<s->length/2;i++){
        temp=s->data[i];
        s->data[i]=s->data[s->length-i-1];
        s->data[s->length-i-1]=temp;
    }
    return 0;
}

void Print(SqList *L)
{
    for(int i=0;i<L->length;i++){
        printf("%d\t",L->data[i]);
    }
    printf("\n");
}
