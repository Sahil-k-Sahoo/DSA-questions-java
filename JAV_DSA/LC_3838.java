class Solution{
    public String mapWordWeights(String[] words,int[] weights){
        StringBuilder ans=new StringBuilder();
        for(String x:words){
            int sum=0;
            for(char ch:x.toCharArray()){
                sum+=weights[ch-'a'];
            }
            int r=sum%26;
            ans.append((char)('z'-r));
        }
        return ans.toString();
    }
}