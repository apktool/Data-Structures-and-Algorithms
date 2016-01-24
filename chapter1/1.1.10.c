//将两个有序的顺序表合并成一个新的有序顺序表，由函数返回结果顺序表
#include<stdio.h>
#include<stdlib.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
	ElemType data[MaxSize];
    int length;
}SqList;

SqList* Merge(SqList *, SqList *);
void print(SqList*);

int main(int argc, char* argv[])
{
    SqList SL1, SL2;
    SL1.length = 10;
    SL2.length = 10;
    for (int i = 0; i < SL1.length; i++){
		SL1.data[i] = 2 * i + 1;
	}
	for (int i = 0; i < SL2.length; i++){
		SL2.data[i] = 2 * i;
	 }
	print(&SL1);
	print(&SL2);
	SqList *SL;
	SL = Merge(&SL1, &SL2);
	print(SL);
	return 0;
}

SqList* Merge(SqList *L1, SqList *L2)
{
	SqList *L = (SqList*)malloc(sizeof(SqList));
	int i = 0, j = 0, k = 0;
	while(i<L1->length&&j<L2->length){	
		if (L1->data[i] <= L2->data[j]){
			L->data[k++] = L1->data[i++];
		}
		else{
			L->data[k++] = L2->data[j++];
		}
	}
	while (i != L1->length){
		L->data[k++] = L1->data[i++];
	}
	while (j != L2->length){
		L->data[k++] = L1->data[j++];
	}
	L->length = k;
	return L;
}

void print(SqList *L){
	for (int i = 0; i < L->length; i++){
		printf("%4d", L->data[i]);
	}
	printf("\n");
}
