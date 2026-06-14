class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int n:nums){
            Stack<Integer> st=new Stack<>();
            while(n>0){
                st.push(n%10);
                n/=10;
            }
            while(!st.isEmpty()){
                list.add(st.pop());
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}