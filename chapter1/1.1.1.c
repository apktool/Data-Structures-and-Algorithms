//从顺序表中删除具有最小值的元素（假设唯一），并由函数返回被删元素的值。空出的位置由最有一个元素填补，若顺序表为空则显示出错信息，并退出运行。
#include<stdio.h>
#include<stdlib.h>
#define MaxSize 100
typedef int ElemType;
//定义顺序表
typedef struct{
    ElemType data[MaxSize];
    int length;
}SqList;
//声明函数
ElemType DelMin(SqList *);
void print(SqList *);

int main(int argc,char *argv[])
{
    SqList SL;
    SL.length=10;
    //初始化线性表
    for(int i=0;i<SL.length;i++){
        SL.data[i]=SL.length-i;
    }
    print(&SL);

    ElemType e;
    e=DelMin(&SL);
    print(&SL);
    printf("The number %d is deleted!\n",e);
    return 0;
}
//删除最小值
ElemType DelMin(SqList *s)
{
    int i=0,k;
    if(s->length<=0){
        printf("The SqList illegal! \n");
        exit(-1);
    }
    ElemType temp=s->data[i];
    for(i=0;i<s->length;i++){
        if(temp>s->data[i]){
            temp=s->data[i];
            k=i;
        }
    }
    if(k==i-1){
        s->data[k]=s->data[i-2];
    }else{
        s->data[k]=s->data[i-1];
    }
    ElemType e=temp;
    return e;   
}
//打印顺序表
void print(SqList *s)
{
    for(int i=0;i<s->length;i++){
        printf("%d\t",s->data[i]);
    }
    printf("\n");
}
