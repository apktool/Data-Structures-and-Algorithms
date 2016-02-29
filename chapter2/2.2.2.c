//利用两个栈S1，S2来模拟一个队列
#include<stdio.h>
#include<stdlib.h>

#define MaxSize 10
typedef int ElemType;
typedef struct{
	ElemType data[MaxSize];
	int top;
}SqStack;

void InitStack(SqStack*);
void Push(SqStack*, ElemType);
void Pop(SqStack*, ElemType*);
int StackEmpty(SqStack*);
int StackOverflow(SqStack*);

void Print(SqStack*);

int EnQueue(SqStack*,SqStack*,ElemType);
int DeQueue(SqStack*,SqStack*,ElemType*);
int QueueEmpty(SqStack*, SqStack*);

int main(int argc,char* argv[])
{
	SqStack S1;
	SqStack S2;

	InitStack(&S1);
	InitStack(&S2);
	
	for(int i=0;i<10;i++){
		EnQueue(&S1,&S2,i);
	}
	
	ElemType x;
	DeQueue(&S1,&S2,&x);
	printf("%4d\n",x);
	DeQueue(&S1,&S2,&x);
	printf("%4d\n",x);
	DeQueue(&S1,&S2,&x);
	printf("%4d\n",x);
	
	return 0;
}

//入队

int EnQueue(SqStack *S1,SqStack *S2,ElemType x)
{
	if(StackOverflow(S1)!=0){
		Push(S1,x);
		return 0;
	}
	if(StackOverflow(S1)==0&&StackEmpty(S2)!=0){
		printf("The Queue is full!\n");
		return -1;
	}
	if(StackOverflow(S1)==0&&StackEmpty(S2)==0){
		while(StackEmpty(S1)!=0){
			Pop(S1,&x);
			Push(S2,x);
		}
		return 0;
	}
	return -1;
}
//出队
int DeQueue(SqStack *S1,SqStack *S2, ElemType* x)
{
	if(StackEmpty(S2)!=0){
		Pop(S2,x);
	}else if(StackEmpty(S1)==0){
		printf("The queue is empty!\n");
		return -1;
	}else{
		while(StackEmpty(S1)!=0){
			Pop(S1,x);
			Push(S2,*x);
		}
		Pop(S2,x);
	}
	return 0;
}
//判断队列是否为空
int QueueEmpty(SqStack *S1, SqStack *S2)
{
	if(StackEmpty(S1)==0&&StackEmpty(S2)==0){
		printf("The Queue is empty!\n");
		return 0;
	}else{
		return -1;
	}
}

/*--------------------------------------------*/

//初始化栈
void InitStack(SqStack *S)
{
	S->top=-1;
}
//入栈
void Push(SqStack *S, ElemType x)
{
	if(S->top==MaxSize-1){
		printf("The Stack is full!\n");
		return;
	}
	S->data[++S->top]=x;
}
//出栈
void Pop(SqStack *S, ElemType *x)
{
	if(S->top==-1){
		printf("The Stack is empty!\n");
		return;
	}
	*x=S->data[S->top--];
}
//判断栈是否为空
int StackEmpty(SqStack *S)
{
	if(S->top==-1){
		return 0;
	}
	return -1;
}
//判断栈是否已满
int StackOverflow(SqStack *S)
{
	if(S->top==MaxSize-1){
		return 0;
	}
	return -1;
}
//打印栈中所有元素
void Print(SqStack *S)
{
	int i=S->top;
	while(i!=-1){
		printf("%4d",S->data[i]);
		i--;
	}
	printf("\n");
}

