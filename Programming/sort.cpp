#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
	string s="jehswhypnaqpgqo";
	int a=8 ,b= 11;
	for(int i=a;i<b+1;i++){
		for(int j=0;j<b-i-1;j++){
			if(s[j]<s[a+j+1]){
				int temp=s[a+j];
				s[a+j]=s[a+j+1];
				s[a+j+1]=temp;
				cout<<s[j]<<endl;
			}
		}
	}
	cout<<s<<endl;
	return 0;
}