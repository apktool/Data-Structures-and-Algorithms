//设有主串s和子串t,子串t的定位就是要在主串s中找到一个与子串t相等的子串。
//通常把主串s称为目标串,把子串t称为模式串,因此定位也称作模式匹配。
//模式匹配成功是指在目标串s中找到一个模式串t；不成功则指目标串s中不存在模式串t。

#include<stdio.h>
#include<stdlib.h>

#define MaxSize 100
typedef char ElemType;
typedef struct{
	ElemType data[MaxSize];
	int length;
}String;

void StrCreat(String*);
void Print(String*);
int FindSub(String*,String*);


int main(int argc,char* argv[])
{
	String *s;
	s=(String*)malloc(sizeof(String));
	StrCreat(s);

	String *t;
	t=(String*)malloc(sizeof(String));
	StrCreat(t);

	int flag=FindSub(s,t);
	if(flag==0){
		printf("t is subString of s!\n");
	}else{
		printf("t is not subString of s!\n");
	}

	return 0;
}
//创建串
void StrCreat(String* S){
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
//模式匹配，寻找s中是否存在子串t
int FindSub(String* S, String* T){
	int i=0,j=0;
	while(i<S->length&&j<T->length){
		if(S->data[i]==T->data[j]){
			i++;
			j++;
		}else{
			i=i-j+1;
			j=0;
		}
	}
	if(j==T->length){
		return 0;
	}else{
		return -1;
	}
}
//打印所有串元素
void Print(String* S){
	for(int i=0;i<S->length;i++){
		printf("%c",S->data[i]);
	}
	printf("\n");
}
