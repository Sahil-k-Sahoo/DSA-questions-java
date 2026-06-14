class Solution{
    public int[] pivotArray(int[] nums,int pivot){

        int[] ans=new int[nums.length];
        int x=0;
        for(int num:nums){
            if(num<pivot){
                ans[x++]=num;
            }
        }
        for(int num:nums){
            if(num==pivot){
                ans[x++]=num;
            }
        }
        for(int num:nums){
            if(num>pivot){
                ans[x++]=num;
            }
        }
        return ans;
    }
}