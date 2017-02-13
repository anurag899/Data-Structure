#include <stdio.h>
#include <stdlib.h>
typedef struct node{
	int d;
	struct node* n;
} Node;
Node* push(Node* head,int d){
	Node* t = (Node*)malloc(sizeof(Node));
	t->d=d;
	t->n=NULL;
	if(!head || head->d>=d){
		t->n=head;
		head=t;
	}
	else{
		Node* cur = head;
		while(cur->n && cur->n->d<=d){
			cur=cur->n;
		}
		t->n=cur->n;
		cur->n=t;
	}
	return head;
}
void print(Node* head){
	while(head){
		printf("%d\t",head->d);
		head=head->n;
	}
	printf("\n");
}
Node* merge(Node* a,Node* b){
	Node* result=NULL;
	if(!a){return b;}
	else if(!b){return a;}
	if(a->d <= b->d){
		result=a;
		result->n=merge(a->n,b);
	}
	else{
		result=b;
		result->n=merge(a,b->n);
	}
	return result;
}
int main(){
	int m,n;
	Node* a=NULL,*b=NULL;
	scanf("%d",&m);
	for(int i=0;i<m;i++){
		int k;
		scanf("%d",&k);
		a=push(a,k);
	}	
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		int k;
		scanf("%d",&k);
		b=push(b,k);
	}
	print(a);
	print(b);
	Node* result=merge(a,b);
	print(result);
	return 0;
}