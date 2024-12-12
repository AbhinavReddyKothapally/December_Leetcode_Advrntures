class Solution {
    public long pickGifts(int[] gifts, int k) {
        int i=gifts.length-1;
        long sum=0;
        while(k-->0)
        {
            Arrays.sort(gifts);
            gifts[i]=(int)Math.sqrt(gifts[i]);
        }
        for(int ind=i;ind>=0;ind--)
        sum+=gifts[ind];
        return sum;
    }
}
