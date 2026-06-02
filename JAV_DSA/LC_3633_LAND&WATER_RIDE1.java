class Solution {
    public int earliestFinishTime(int[] landStartTime,int[] landDuration,int[] waterStartTime,int[] waterDuration) {
       int f=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int lEnd=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int f1=Math.max(lEnd,waterStartTime[j])+waterDuration[j];
                f=Math.min(f,f1);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int wEnd=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landStartTime.length;j++){
                int f1=Math.max(wEnd,landStartTime[j])+landDuration[j];
                f=Math.min(f,f1);
            }
        }
        return f; 
    }
}