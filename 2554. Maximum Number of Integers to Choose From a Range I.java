class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] set=new boolean[10001];
        for(int i=0;i<banned.length;i++) set[banned[i]]=true;
        int count=0;
        int sum=0,i=1;
        while((sum+i)<=maxSum && i<=n)
        {
           
            if(!set[i]){
                sum+=i;
                count++;
            }
            i++;
        }
        return count;
    }
}
