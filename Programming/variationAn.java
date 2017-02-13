import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        while(t--!=0){
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            // for(int i=0;i<n-1;i++){
            //     for(int j=0;j<n-i-1;j++){
            //         if(arr[j]<arr[j+1]){
            //             int temp=arr[j];
            //             arr[j]=arr[j+1];
            //             arr[j+1]=temp;
            //         }
            //     }
            // }
            MergeSort ms=new MergeSort();
            ms.sort(arr,0,n-1);
            int maxValue=Math.abs(arr[arr.length-1]-arr[0]);
            System.out.println(maxValue);
        }
    }
}class MergeSort
{
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }

}