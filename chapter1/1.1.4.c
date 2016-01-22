//从顺序表中删除其值在给定值s与t之间（包含s和t，要求s&lt;t）的所有元素，如果s或t不合理或者顺序表为空则显示出错信息并退出运行。
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
	ElemType data[MaxSize];
	int length;
}SqList;

int Delst(SqList*, ElemType, ElemType); 
void print(SqList*); 
int main(int argc, char* argv[])
{
	SqList SL;
	SL.length=10;
	SL.data[0]=8;SL.data[1]=0;SL.data[2]=1;SL.data[3]=5;SL.data[4]=2;
	SL.data[5]=4;SL.data[6]=9;SL.data[7]=3;SL.data[8]=7;SL.data[9]=6;

	int flag;
	ElemType s=3, t=8;
	print(&SL);
	flag=Delst(&SL, s, t);
	print(&SL);
	if(flag==0){
		printf("Del success! \n");
	}else{
		printf("Del false! \n");
	}
	return 0;
}

int Delst(SqList *L, ElemType s, ElemType t){
	int k=0;
	if(s>t||L->length==0){
		printf("The number is illegal! \n");
		return -1;
	}
	for(int i=0;i<L->length;i++){
		if(L->data[i]>t||L->data[i]<s){
			L->data[k++]=L->data[i];
		}
	}
	L->length=k;
	return 0;
}

void print(SqList*L){
	for(int i=0;i<L->length;i++){
		printf("%d\t",L->data[i]);
	}
	printf("\n");	
}
