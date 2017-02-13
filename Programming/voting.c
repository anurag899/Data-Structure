#include<stdio.h>
#include<stdlib.h>
typedef struct node{
	int data;
	int count;
	struct node* next;
} Node;
Node* insert(Node* head,int data){
	Node* temp=(Node*)malloc(sizeof(Node));
	temp->data=data;
	temp->count=1;
	if(!head || head->data <= data){
		temp->next = head;
		head=temp;
	}
	else{
		Node* cur = head;
		while(cur->next && cur->next->data >= data){
			cur=cur->next;
		}
		temp->next=cur->next;
		cur->next=temp;
	}
	return head;
}
void print(Node* head){
	while(head){
		printf("(%d,%d)\t",head->data,head->count );
		head=head->next;
	}
	printf("\n");
}
// Node* merge(Node* a,Node* b){
// 	Node* result = NULL;
// 	if(!a){return b;}
// 	else if(!b){return a;}
// 	if(a->data>b->data){
// 		result=a;
// 		result->next=merge(a->next,b);
// 	}
// 	else if(a->data==b->data){
// 		result=a;
// 		result->count=result->count+1;
// 		result->next= merge(a->next,b->next);
// 	}
// 	else{
// 		result = b;
// 		result->next=merge(a,b->next);
// 	}

// 	return result;
// }
Node* SortedMerge(Node* a, Node* b)
{
 	Node* result = NULL;
	if(!a){return b;}
	else if(!b){return a;}
	if(a->data>b->data){
		result=a;
		result->next=SortedMerge(a->next,b);
	}
	else if(a->data==b->data){
		result=a;
		result->count=result->count+1;
		result->next= SortedMerge(a->next,b->next);
	}
	else{
		result = b;
		result->next=SortedMerge(a,b->next);
	}

	return result;
}
 
// The main function that takes an array of lists
// arr[0..last] and generates the sorted output
Node* mergeKLists(Node* arr[], int last)
{
    // repeat until only one list is left
    while (last != 0)
    {
        int i = 0, j = last;
 
        // (i, j) forms a pair
        while (i < j)
        {
            // merge List i with List j and store
            // merged list in List i
            arr[i] = SortedMerge(arr[i], arr[j]);
 
            // consider next pair
            i++, j--;
 
            // If all pairs are merged, update last
            if (i >= j)
                last = j;
        }
    }
 
    return arr[0];
}
int winner(Node* head){
	int win=0;
	while(head){
		if(head->count>=3){
			win++;
		}
		head=head->next;
	}
	return win;
}
int main(){
	Node* z[5]={NULL};
	// ,*z2=NULL,*z3=NULL,*z4=NULL,*z5=NULL
	int n1,n2,n3,n4,n5;
	scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
	for(int i=0;i<n1;i++){
		int t;
		scanf("%d",&t);
		z[0]=insert(z[0],t);
	}
	for(int i=0;i<n2;i++){
		int t;
		scanf("%d",&t);
		z[1]=insert(z[1],t);
	}
	for(int i=0;i<n3;i++){
		int t;
		scanf("%d",&t);
		z[2]=insert(z[2],t);
	}
	for(int i=0;i<n4;i++){
		int t;
		scanf("%d",&t);
		z[3]=insert(z[3],t);
	}
	for(int i=0;i<n5;i++){
		int t;
		scanf("%d",&t);
		z[4]=insert(z[4],t);
	}
	for(int i=0;i<5;i++)
		print(z[i]);
	
	// Node* result4 = merge(z[0],z[1]);
	// Node* result3 = merge(result4,z[2]);
	// Node* result2 = merge(result3,z[3]);
	// Node* result = merge(result2,z[4]);
	Node* result=mergeKLists(z,4);
	print(result);

	printf("%d\n",winner(result));
	return 0;
}