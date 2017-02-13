#include <stdio.h>
#include <stdlib.h>
typedef struct node{
	int d;
	struct node* n;
} Node;
void print(Node* head){
	while(head){
		printf("%d\t",head->d);
		head=head->n;
	}
	printf("\n");
}
Node* insertSort(Node* head,int d){
	Node* temp=(Node*)malloc(sizeof(Node));
	temp->n=NULL;
	temp->d=d;
	if(!head || head->d >= d){
		temp->n=head;
		head=temp;
	}
	else{
		Node* current = head;
		while(current->n && current->n->d <= d){
			current=current->n;
		}
		temp->n=current->n;
		current->n=temp;
	}
	return head;
}
Node* reverse(Node* head){
	Node* prev=NULL;
	Node* cur=head;
	Node* next;
	while(cur){
		next=cur->n;
		cur->n=prev;
		prev=cur;
		cur=next;
	}
	head=prev;
	return head;
}
Node* swap(Node* head,int x,int y){
	if(x==y){
		return NULL;
	}
	Node* prex=NULL,*curx=head;
	while(curx && curx->d !=x){
		prex=curx;
		curx=curx->n;
	}
	Node* prey=NULL,*cury=head;
	while(cury && cury->d !=y){
		prey=cury;
		cury=cury->n;
	}
	if(!cury || !curx){return NULL;}
	if(prex){
		prex->n=cury;
	}
	else{
		head=cury;
	}
	if(prey){
		prey->n=curx;
	}
	else{
		head=curx;
	}
	Node* temp=curx->n;
	curx->n=cury->n;
	cury->n=temp;
	return head;
}
int main(){
	Node* head=NULL;
	int t;
	scanf("%d",&t);
	for(int i=t;i>0;i--){
		int m;
		scanf("%d",&m);
		head=insertSort(head,m);
	}
	print(head);
	head=reverse(head);
	print(head);
	head=swap(head,46,5);
	print(head);
	return 0;
}
