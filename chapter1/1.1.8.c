//线性表(a_1,a_2,a_3,...,a_n)中元素递增有序，且按顺序存储于计算机内。要求设计一算法完成用最少时间在表中查找数据值为x的元素；若找到，将其与后继元素位置交换；若找不到将其插入到表中，使表中的元素仍递增有序
#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
	ElemType data[MaxSize];
	int length;
}SqList;

int FindDI(SqList*, ElemType);
void Print(SqList*);

int main(int argc,char *argv[])
{
	SqList SL;
	ElemType e=4;
	SL.length=10;
	for(int i=0;i<SL.length;i++){
		SL.data[i]=2*i+1;
	}
	Print(&SL);
	int flag=FindDI(&SL,e);
		
	if(flag==-1){
		printf("Not find!It will be instered the true position\n");
		Print(&SL);
	}else{
		printf("Find success!\n");
		printf("It is posed %dth, It will swap with next number!\n", flag);
		Print(&SL);
	} 
	return 0;
}

int FindDI(SqList *L, ElemType x)
{
	int low=0, high=L->length-1;
	int mid;
	while(low<high){
		mid=(low+high)/2;
		if(L->data[mid]==x){
			break;
		}else if(L->data[mid]<x){
			low=mid+1;
		}else{
			high=mid-1;
		}
	}
	
	if(L->data[mid]==x&&L->data[mid]!=L->length-1){
		ElemType temp;
		temp=L->data[mid];
		L->data[mid]=L->data[mid+1];
		L->data[mid+1]=temp;
		return mid+1;
	}
	
	if(low>high){
		int i;
		for(i=L->length;i>mid;i--){
			L->data[i]=L->data[i-1];
		}
		L->data[i]=x;
		L->length=L->length+1;
		return -1;
	}
	return 0;
}

void Print(SqList *L)
{
	for(int i=0;i<L->length;i++){
		printf("%4d",L->data[i]);
	}
	printf("\n");
}
