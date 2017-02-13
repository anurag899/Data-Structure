#include <iostream>
using namespace std;
bool graph[1000][1000];
void initliaze(){
	for(int i=0;i<10000;i++){
		for(int j=0;j<1000;j++){
			graph[i][j]=false;
		}
	}
}
main(){
	int nodes,edges,x,y;
	cin >> nodes;
	cin >> edges;
	for(int i=0;i<edges;i++){
		cin>>x;
		cin>>y;
		if(x!=y){
				graph[x][y]=true;
				graph[y][x]=true;}
	}
	int query;
	cin >> query;
	while(query>0){
		int a,b;
		cin >>a;
		cin >>b;
		if(graph[a][b]==true || graph[b][a]==true){
			cout<<"YES"<<endl;
		}
		else{
			cout<<"NO"<<endl;
		}
		query--;
	}
}