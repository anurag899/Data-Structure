#include <iostream>
#include <cmath>
using namespace std;
int divisor(int n){
    int sum=0;
    for (int i=2; i<=sqrt(n)+1; i++)
    {
        if (n%i==0)
        {
            // If divisors are equal, print only one
            if (n/i == i)
                sum+=i;

            else // Otherwise print both
                sum+=i;
                sum+=n/i;
        }
    }
    cout<<sum<<endl;
    return sum;
}
int main()
{
    int t,n;
    cin>>t;
    while(t-->0){
        cin>>n;
        if(n==divisor(n)){
            cout<<"yes"<<endl;
        }
        else{
            cout<<"no"<<endl;
        }
    }
}
