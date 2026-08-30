class Solution {
    public int maximumProduct(int[] nums) {
       int max=Integer.MIN_VALUE;
       Arrays.sort(nums);
       int n=nums.length;
       int op1=nums[n-1]*nums[n-2]*nums[n-3];
       int op2=nums[0]*nums[1]*nums[n-1];
       max=Math.max(op1,op2);
       return max;
    }
}