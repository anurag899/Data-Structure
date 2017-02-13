#include<iostream>
#include<stdlib.h>
using namespace std;
typedef struct friends{
	int p;
	struct friends * next;
} Friend;
Friend* createFriend(int data){
	Friend* temp = (Friend*)malloc(sizeof(Friend));
	temp->p=data;
	temp->next=NULL;
	return temp;
}
Friend* insert(Friend* head,int data){
	Friend* temp=createFriend(data);
	
	if(head==NULL){
		head=temp;
		
	}
	else{
		Friend* p;
		p=head;
		while(p->next!=NULL){
			p=p->next;
		}
		p->next=temp;}
	return head;
}
void print(Friend* head){
	while(head!=NULL){
		cout<<head->p<<endl;
		head=head->next;
	}
}
int main(){
	int n;
	int t;
	Friend* head=NULL;
	cin>>n<<t;
	while(t--){
		for(int i=0;i<n;i++){
			int x;
			cin>>x;
			head=insert(head,x);
		}
	}
	print(head);
}