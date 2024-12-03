class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int idx=0;
        for(int i=0;i<spaces.length;i++)
        {
            ans.append(s.substring(idx,spaces[i]));
            ans.append(" ");
            idx=spaces[i];
        }
        ans.append(s.substring(idx));
        return ans.toString();
    }
}
