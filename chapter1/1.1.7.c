//描述1：已知在一维数组A[m+n]中依次存放着两个线性表$(a1,a2,a3,...,am)$和$(b1,b2,b3,...,bn),试编写一个函数，将数组中两个顺序表互换，即将(b1,b2,b3,...,bn)放在$(a1,a2,a3,...,am)$的前面

//描述2：已知在一维数组A[m+n]中依次存放着两个线性表(a_1,a_2,a_3,...,a_m)和(b_1,b_2,b_3,...,b_n),试编写一个函数将A中保存的序列循环左移m位

#include<stdio.h>
#define MaxSize 100
typedef int ElemType;

typedef struct{
	ElemType data[MaxSize];
	int length;
}SqList;

void Reverse(SqList*, int, int, int);
void Print(SqList*);

int main(int argc,char* argv[])
{
	SqList SL;
	SL.length=10;
	for(int i=0;i<SL.length;i++){
		SL.data[i]=i+1;
	}

	int m=3, n=SL.length-m;
	
	Print(&SL);
	Reverse(&SL, 0, SL.length-1, SL.length-1);
	Reverse(&SL, 0, m-1, m);
	Reverse(&SL, m, SL.length-1, n);
	Print(&SL);

	return 0;
}

void Reverse(SqList *L, int left, int right, int length)
{
	ElemType temp;
	int mid;
	mid=(left+right)/2;

	for(int i=0;i<=mid-left;i++){
		temp=L->data[left+i];
		L->data[left+i]=L->data[right-i];
		L->data[right-i]=temp;
	}

}

void Print(SqList *L){
	for(int i=0;i<L->length;i++){
		printf("%4d",L->data[i]);
	}
	printf("\n");
}
