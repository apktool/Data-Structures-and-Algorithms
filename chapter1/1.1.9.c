//一个长度为L(L>=1) 的升序序列S，处在第L/2个位置的数称为S的中位数。例如，若序列S1=(11,13,15,17,19)，则S1的中位数是15；
//两个序列的中位数是含它们所有元素所组成的升序序列的中位数。例如，若S2=(2,4,6,8,20)，则S1和S2的中位数是11。
//现在有两个等长升序序列A和B，试设计一个在时间和空间都尽可能高效的算法，找出两个序列A和B的中位数。

#include<stdio.h>
#define MaxSize 5

int FindMid(int*, int*);

int main(int argc,char* argv[])
{
	int A[MaxSize]={11,13,15,17,19};
	int B[MaxSize]={2,4,6,8,20};

	int Num;
	Num=FindMid(A,B);
	printf("The mid Num is %d\n",Num);
	return 0;
}

int FindMid(int A[], int B[])
{
	int s1=0,d1=MaxSize-1,m1;
	int s2=0,d2=MaxSize-1,m2;

	while(s1!=d1||s2!=d2){
		m1=(s1+d1)/2;
		m2=(s2+d2)/2;
		
		if(A[m1]<B[m2]){
			if((s1+d1)%2==0){
				s1=m1;
				d2=m2;
			}else{
				s1=m1+1;
				d2=m2;
			}
		}else if(A[m1]>B[2]){
			if((s2+d2)%2==0){
				d1=m1;
				s2=m2;
			}else{
				d1=m1;
				s2=m2+1;
			}
		}else{
			return A[m1];
		}
	}
	return A[s1]<B[s2]?A[s1]:B[s2];
}
