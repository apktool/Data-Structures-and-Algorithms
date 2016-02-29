//假设I和O分别表示入栈和出栈操作。栈的初状和终态均为空，入栈和出栈的操作序列可表示仅由I和O组成的序列，可以操作的序列称为合法序列，否则称为非法序列。
//试写一个算法完成对下列输入序列的合法性的判断。
//A. IOIIOIOO  B. IOOIOIIO  C.IIIOIOIO  D.IIIOOIOO

#include<stdio.h>
#include<stdlib.h>
#define	 MaxSize 100

typedef char ElemType;
typedef struct{
	ElemType data[MaxSize];
	int top;
}SqStack;

void InitStack(SqStack*);
void Push(SqStack*);
int JudgeLegal(SqStack*);

int main(int argc,char* argv[])
{
	SqStack s;
	InitStack(&s);

	Push(&s);

	int Flag=JudgeLegal(&s);
	if(Flag){
		printf("The subsqence illegal!\n");
	}else{
		printf("The subsquence legal!\n");
	}

	return 0;
}

//初始化栈
void InitStack(SqStack *s)
{
	s->top=-1;
}
//入栈
void Push(SqStack *s)
{
	ElemType x;
	do{
		scanf("%c",&x);
		s->data[++s->top]=x;

	}while(x!='\n');
}
//判断合法性
int JudgeLegal(SqStack *s)
{
	int i=0;
	int j=0;
	int k=0;
	while(s->data[i]!='\0'){
		switch(s->data[i]){
			case 'I':j++;break;
			case 'O':k++;if(k>j){return -1;}break;
		}
		i++;
	}
	if(j!=k){
		return -1;
	}else{
		return 0;
	}
}
