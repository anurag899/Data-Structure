#include<iostream>
using namespace std;
int main(){
	int i,j;
	for(i=1;i<=3;i++){
		for(j=1;j<=3-i;j++){
			cout<<" ";
		}
		while(j<=3){
			cout<<"#";
			j++;
		}
		cout<<endl;
	}
}