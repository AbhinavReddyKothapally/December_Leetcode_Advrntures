class Solution {
    public static boolean search(int i,int[] a,int n)
    {
        int l=0,r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(mid!=i && a[mid]==a[i]*2)
            return true;
            else if((a[i]*2)<a[mid])
            r=mid-1;
            else
            l=mid+1;
        }
        return false;
    }
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(search(i,arr,n))
            return true;
        }
        return false;
    }
}
