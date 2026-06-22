class Solution{
    public int maxNumberOfBalloons(String text){
        int[] f=new int[26];
        for(char i:text.toCharArray()){
            f[i-'a']++;
        }
        int ans=f['b'-'a'];
        ans=Math.min(ans,f['a'-'a']);
        ans=Math.min(ans,f['l'-'a']/2);
        ans=Math.min(ans,f['o'-'a']/2);
        ans=Math.min(ans,f['n'-'a']);
        return ans;
    }
}