//汽车轮渡口，过江渡船每次能载10辆车过江。过江车分为客车和货车类，上渡船有如下规定：
//	1).同类车先到先上船；
//	2).客车先于货车上渡船，其每上4辆客车，才允许放上一辆货车；
//	3).若等待客车不足4辆，则以货车代替；
//	4).若无货车等待，允许客车都上船。
//试设计一个算法模拟渡口管理

#include<stdio.h>
#define MaxSize 10

typedef char ElemType;
typedef struct{
	ElemType data[MaxSize];
	int front, rear;
}SqQueue;

void InitQueue(SqQueue*);
void EnQueue(SqQueue*, ElemType);
void DeQueue(SqQueue*, ElemType*);
int IsEmpty(SqQueue*);
void Mangager(SqQueue*, SqQueue*, SqQueue*);
void PrintQueue(SqQueue);

int main(int argc,char* argv[])
{
	SqQueue Q;
	SqQueue Qp;//客车
	SqQueue Qt;//货车
	
	InitQueue(&Q);
	InitQueue(&Qp);
	InitQueue(&Qt);

	ElemType x='P';
	for(int i=0;i<6;i++){
		EnQueue(&Qp,x);
	}	
	ElemType y='T';
	for(int i=0;i<6;i++){
		EnQueue(&Qt,y);
	}

	int count=0;
	int car=0;
	ElemType e;

	//渡口模拟
	while(count<=MaxSize){
		if(IsEmpty(&Qp)!=0&&car<4){
			DeQueue(&Qp,&e);
			EnQueue(&Q,e);
			car++;
			count++;
		}else if(car==4&&IsEmpty(&Qt)!=0){
			DeQueue(&Qt,&e);
			EnQueue(&Q,e);
			car=0;
			count++;
		}
		else{
			while(count<=MaxSize&&IsEmpty(&Qt)!=0){
				DeQueue(&Qt,&e);
				EnQueue(&Q,e);
				count++;
			}
		}
		if(IsEmpty(&Qt)==0&&IsEmpty(&Qp)==0)
		{
			count=11;
		}
	}

	PrintQueue(Q);

	return 0;
}

/*---------------------------------------------------------------*/

void InitQueue(SqQueue* Q)
{
	Q->front=0;
	Q->rear=0;
}

void EnQueue(SqQueue* Q, ElemType x)
{
	if(Q->rear==MaxSize-1){
		return;
	}
	Q->data[Q->rear++]=x;
}

void DeQueue(SqQueue* Q, ElemType *x)
{
	if(Q->front==Q->rear&&Q->front==0){
		return;
	}
	*x=Q->data[Q->front++];
}

int IsEmpty(SqQueue* Q)
{
	if(Q->front==Q->rear){
		return 0;
	}else{
		return -1;
	}
}

void PrintQueue(SqQueue Q)
{
	while(Q.front!=Q.rear){
		printf("%4c",Q.data[Q.front++]);
	}
	printf("\n");
}
