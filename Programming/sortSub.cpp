#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t-->0){
		string s;
		cin>>s;
		int a,b;
		cin>>a>>b;
			for(int i=a;i<b-1;i++){
				for(int j=a;j<b-i-1;j++){
					if(s[j]<s[j+1]){
						int temp=s[j];
						s[j]=s[j+1];
						s[j+1]=temp;
					}
				}
			}
		cout<<s<<endl;
	}
	return 0;
}