#include<stdio.h>
#include<stdlib.h>
int main(){
	// int n;
	// scanf("%d",&n);
	// int arr = (int*)malloc(n*sizeof(int));
	// for(int i=0;i<n;i++){
	// 	scanf("%d",&arr[i]);
	// }
	int arr[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
	int n=sizeof(arr)/sizeof(arr[0]);
	int k =arr[0];
	int count=1;
	for(int i=1;i<n;i++){
		if(k<arr[i]){
			k=arr[i];
			count++;
		}
		// printf("%d\n",arr[i] );
	}
	printf("%d\n",count );
	return 0;
}