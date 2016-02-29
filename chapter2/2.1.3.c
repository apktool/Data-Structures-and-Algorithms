//设有两个栈s1,s2都采用顺序栈方式，并且共享一个存储区[0,...,MaxSize-1]，为了尽量利用空间，减少溢出的可能，可采用栈顶相向，迎面增长的方式。试设计s1,s2有关入栈和出栈的操作算法。

#include<stdio.h>
#include<stdlib.h>
#define	 MaxSize 100

typedef int ElemType;
typedef struct{
	ElemType data[MaxSize];
	int top[2];
}SqStack;

void InitStack(SqStack*);
int Push(SqStack*,ElemType,int);
int Pop(SqStack*,ElemType*,int);

int main(int argc,char* argv[])
{
	SqStack s;
	InitStack(&s);

	ElemType x=5;
	int n=0;
	int flagPush;
	flagPush=Push(&s,x,n);
	if(flagPush){
		printf("Push false!\n");
	}else{
		printf("Push %d success!\n",x);
	}

	int flagPop;
	flagPop=Pop(&s,&x,n);
	if(flagPop){
		printf("Pop false!\n");
	}else{
		printf("Pop %d  success!\n",x);
	}
	return 0;
}
//初始化共享栈
void InitStack(SqStack *s)
{
	s->top[0]=-1;
	s->top[1]=MaxSize;
}
//入栈操作
int Push(SqStack*s, ElemType x, int n)
{
	if(n<0||n>1){
		printf("The stack number is false!\n");
		return -1;
	}
	if(s->top[1]-s->top[0]==1){
		printf("The stack is full!\n");
		return -1;
	}
	switch(n){
		case 0:s->data[++s->top[0]]=x;break;
		case 1:s->data[--s->top[1]]=x;break;
	}
	return 0;
}
//出栈操作
int Pop(SqStack *s, ElemType* x,int n)
{
	if(n<0||n>1){
		printf("The stack number is false!\n");
		return -1;
	}
	switch(n){
		case 0:
			if(s->top[0]==-1){
				printf("The stack[0] is empty!\n");
			}
			*x=s->data[s->top[0]--];
			break;
		case 1:
			if(s->top[1]==MaxSize){
				printf("The stack[1] is empty!\n");
			}
			*x=s->data[s->top[1]++];
			break;
	}
	return 0;
}
