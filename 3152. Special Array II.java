class Solution {
    public static int checkup(ArrayList<Integer> list, int num)
    {
        int l=0,r=list.size()-1,pos=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(list.get(mid)==num) return num;
            else if(list.get(mid)>num){
                pos=list.get(mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return pos;
    }
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] ans=new boolean[queries.length];
        int i=0;
        while((i+1)<n)
        {
            while(((i+1)<n)&&((nums[i]+nums[i+1])%2)==1)
            {
                i++;
            }
            list.add(i);
            i++;
        }
        if((list.size()>0) && list.get(list.size()-1)!=n-1) list.add(n-1);
        int k=0;
        for(int j=0;j<queries.length;j++)
        {
            if(checkup(list,queries[j][0])==checkup(list,queries[j][1]))
            ans[k++]=true;
            else
            ans[k++]=false;
        }
        return ans;
    }
}
