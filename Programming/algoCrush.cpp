#include<iostream>
#include<climits>
using namespace std;
int main(){
	long n,m;
    cin>>n>>m;
    long *arr = new long[n];
    // for(long i=0;i<n;i++){
    //     cout<<arr[i]<<endl;
    // }
    while(m--){
        long a,b,k;
        cin>>a>>b>>k;
        for(long i=a-1;i<b;i++){
            arr[i]+=k;
        //     cout<<"value of index "<<i<<" "<<arr[i]<<endl;
         }
    }
    long maxValue=INT_MIN;
    for(int i=0;i<n;i++){
        if(maxValue<arr[i]){
        	maxValue=arr[i];
        }
    }
    cout<<maxValue<<endl;
    return 0;
}