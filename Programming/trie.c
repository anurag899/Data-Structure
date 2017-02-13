#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<stdbool.h>
typedef struct TrieNode{
	bool isLeaf;
	struct TrieNode *child[26];
} T;
T* getNode(){
	T* tree=NULL;
	tree=(T*)malloc(sizeof(T));
	if(tree){//first error
		tree->isLeaf=false;
		for(int i=0;i<26;i++){
			tree->child[i]=NULL;
		}
	}
	return tree;
}	
void insert(T* tree,char* key){
	T* p = tree;
	int index,level;
	int n = strlen(key);//second error
	for(int level=0;level<n;level++){
		index=(int)key[level]-(int)'a';
		if(!p->child[index])
			p->child[index]=getNode();
		p=p->child[index];
	}
	p->isLeaf=true;
}
bool search(T* tree,char* key){
	int index;
	int length=strlen(key);
	int level;
	T* p = tree;
	for(level=0;level<length;level++){
		index=(int)key[level]-(int)'a';
		if(!p->child[index])
			return false;
		p=p->child[index];
	}
	return (p!=NULL && p->isLeaf);
}
int main(){
	char key[][8]={"the","a","there","answer","any"};
	char answer[][32]={"Not present","present"};
	T* tree=getNode();
	for(int i=0;i<5;i++){
		insert(tree,key[i]);
	}
	printf("%s",answer[search(tree,"the")]);
	printf("%s",answer[search(tree,"anurag")]);
	return 0;
}
