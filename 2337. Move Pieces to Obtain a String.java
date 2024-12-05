class Solution {
    public boolean canChange(String start, String target) {
        int i=0,j=0,n1=start.length();
        while(i<n1 || j<n1)
        {
            while(i<n1 && start.charAt(i)=='_') i++;
            while(j<n1 && target.charAt(j)=='_') j++;
            if (i == n1 || j == n1) {
                return i == n1 && j == n1;
            }
            if(start.charAt(i)!=target.charAt(j)) return false;
            if(start.charAt(i)=='L' && (i<j)) return false;
            if(start.charAt(i)=='R' && (i>j)) return false;
            i++;
            j++;
        }
        return true;
    }
}
