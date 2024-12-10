class Solution {
    public static boolean isSpecial(String str)
    {
        for(int i=0;i+1<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i+1)) return false;
        }
        return true;
    }
    public int maximumLength(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int ans=-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String substr=s.substring(i,j);
                if(isSpecial(substr))
                {
                    map.put(substr,map.getOrDefault(substr,0)+1);
                }
            }
        } 
        for(String str:map.keySet())
        {
            if(str.length()>ans && map.get(str)>=3)
            ans=str.length();
        }
        return ans;
    }
}
