//设有主串S和子串T，子串T的定位就是要在主串S中找到一个与子串T相等的子串

#include<stdio.h>
#include<stdlib.h>

#define MaxSize 100
typedef char ElemType;
typedef struct{
	ElemType data[MaxSize];
	int length;
}String;

void StrCreatS(String*);
void StrCreatT(String*);
void Print(String*);
void BuildNext(String*,int*);
int KMP(String*,String*,int*);

int main(int argc,char* argv[])
{
	String *s;
	s=(String*)malloc(sizeof(String));
	StrCreatS(s);

	String *t;
	t=(String*)malloc(sizeof(String));
	StrCreatT(t);
	
	int next[MaxSize]={0};
	BuildNext(t,next);

	int flag=KMP(s,t,next);
	if(flag!=-1){
		printf("Position is %d.\n",flag+1);
	}else{
		printf("Illege Find!\n");
	}

	return 0;
}
//创建主串
void StrCreatS(String* S){
	char x;
	S->length=0;
	printf("Input String_S(End of '#'!):\n");
	scanf("%c",&x);
	while(x!='#'){
		S->data[S->length++]=x;
		scanf("%c",&x);
	}
	getchar();
}
//创建子串
void StrCreatT(String* S){
	char x;
	S->length=0;
	printf("Input String_T(End of '#'!):\n");
	scanf("%c",&x);
	while(x!='#'){
		S->data[++S->length]=x;
		scanf("%c",&x);
	}
	getchar();
}
//打印字符串
void Print(String *S)
{
	for(int i=0;i<S->length;i++){
		printf("%c",S->data[i]);
	}
	printf("\n");
}
//建立跳转表
void BuildNext(String* T, int next[])
{
    int i, j;

    i=1;
    j=0;
    next[1]=0;

    while(i<T->length){
		if(T->data[i]==T->data[j]||j==0){
			++i;
			++j;
			if(T->data[i]!=T->data[j]){
				next[i]=j;
			}else{
				next[i]=next[j];
			}
		}else{
			j=next[j];
		}

	}
}
//KMP算法的核心
int KMP(String* S, String* T,int next[])
{
    int i=0, j=1;

	while(i<S->length&&j<T->length){
        if(S->data[i]==T->data[j]||j==0){
            ++i;
            ++j;
        }else{
            j = next[j];
        }
    }
	if(j==T->length){
		return i+1-T->length;
	}else{
		return -1;
	}
}
