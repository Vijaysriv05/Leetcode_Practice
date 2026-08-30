class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n==1) return 1;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
                }
                if(nums[i]>max){
                    max=nums[i];
                    maxIndex=i;
                }
        }
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);
        int op1=right+1;
        int op2=n-left;
        int op3=(left+1)+(n-right);
        return Math.min(op1,Math.min(op2,op3));
    }
}