#include<algorithm>
#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
long int kthSmallest(vector<long int> arr,long int k)
{
    
    sort(arr.begin(), arr.end());
 	if(arr.size()<k){
 		return -1;
 	}
    return arr[k-1];
}
void divisor(long int n,long int k){
	vector<long int> arr;
	int j=0;
	for(long int i=1;i<sqrt(n)+1;i++){
		if(n%i==0){
			if(n/i==i){
				arr.push_back(i);
			}
			else{

				if(std::find(arr.begin(),arr.end(),i)==arr.end())
				{		
					arr.push_back(i);
					arr.push_back(n/i);}
				}
		}
	}


	cout<<kthSmallest(arr,k);
}
main(){
	long int n,k;
	cin>>n>>k;
	divisor(n,k);
}