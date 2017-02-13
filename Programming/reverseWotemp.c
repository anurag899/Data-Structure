#include<string.h>
#include<stdio.h>
int main(){
	char t[]="Anurag";
	int j=strlen(t)-1;
	int i=0;
	while(i<j){
		t[i]^=t[j];t[j]^=t[i];t[i]^=t[j];
		i++;j--;
	}
	printf("%s\n",t );
	return 0;
}