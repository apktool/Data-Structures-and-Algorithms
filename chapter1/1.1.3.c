//从有序顺序表中删除其值在定值s和t之间s<t的所有元素，如果s或t不合理或者顺序表为空，则显示出错信息并退出运行。
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;
//定义顺序表
typedef struct{
    ElemType data[MaxSize];
    int length;
}SqList;

int Delst(SqList *, ElemType, ElemType);
void print(SqList *);

int main(int argc,char* argv[])
{
    SqList SL;
    SL.length=10;
    int s=3,t=8;
	for(int i=0;i<SL.length;i++){
        SL.data[i]=2*i+1;
    }
    int flag;

    print(&SL);
    flag=Delst(&SL, s, t);
    print(&SL);

    if(flag==0){
        printf("Success! \n");
    }else{
        printf("Illege! \n");
    }
    return 0;
}

int Delst(SqList *L, ElemType s, ElemType t)
{
    int i, k=0;
    if(s>t){
        printf("The border is illegal!\n");
        return -1;
    }
    for(i=0;i<L->length;i++){
        if(L->data[i]<s){
            k++;
        }
        if(L->data[i]>t){
            L->data[k++]=L->data[i];
        }
    }
    L->length=k;
    return 0;
}
//打印输出顺序表所有元素
void print(SqList *L)
{
    for(int i=0;i<L->length;i++){
        printf("%d\t",L->data[i]);
    }
    printf("\n");
}
