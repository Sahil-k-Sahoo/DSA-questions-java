class Solution{
    public int largestAltitude(int[] gain){
        int x=0;
        int max=0;
        for(int i:gain){
            x+=i;
            max=Math.max(max,x);
        }
        return max;
    }
}