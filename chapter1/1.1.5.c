//从有序表中删除所有其值重复的元素，使表中所有的元素的值均不同。
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
	ElemType data[MaxSize];
	int length;
}SqList;

int Delrept(SqList *);
void print(SqList *);

int main(int argc, char* argv[]){
	SqList SL;
	SL.length=10;
	SL.data[0]=1;SL.data[1]=1;SL.data[2]=2;SL.data[3]=2;SL.data[4]=2;
	SL.data[5]=3;SL.data[6]=3;SL.data[7]=3;SL.data[8]=3;SL.data[9]=4;
	
	int flag;
	print(&SL);
	flag=Delrept(&SL);
	print(&SL);

	if(flag==0){
		printf("Delete success!\n");
	}else{
		printf("Dlelet illegal!\n");
	}
	return 0;
}

int Delrept(SqList *L){
	int k=0;
	ElemType temp=-1;
	if(L->length==0){
		return -1;
	}
	for(int i=0;i<L->length;i++){
		if(L->data[i]!=temp){
			temp=L->data[i];
			L->data[k++]=L->data[i];
		}
	}
	L->length=k;
	return 0;
}

void print(SqList *L)
{
	for(int i=0;i<L->length;i++){
		printf("%d\t",L->data[i]);
	}
	printf("\n");
}
