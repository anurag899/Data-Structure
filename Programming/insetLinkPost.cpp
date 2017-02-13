#include<iostream>
#include<stdlib.h>
using namespace std;
typedef struct node{
	int d;
	struct node* next;
} Node;
Node* insert(Node* head,int data,int position){
	if(position == 0){
        Node* a = (Node*)malloc(sizeof(Node));
        a->d = data;
        a->next = head;
        return head;
    }else{
        int i;
        Node* a = head;
        for(i = 1; i < position; i++)
            a = a->next;
        Node* tmp = (Node*)malloc(sizeof(Node));
        tmp->d = data;
        tmp->next = a->next;
        a->next = tmp;
        return head;
    }
}

void print(Node* head){
	while(head){
		cout<<head->d<<endl;
		head=head->next;
	}
}
int main(){
	Node * head = NULL;
	head=insert(head,3,0);
	insert(head,2,1);
	insert(head,1,0);
	print(head);
	return 0;
}