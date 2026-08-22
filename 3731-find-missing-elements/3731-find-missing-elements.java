class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
              if(nums[j]==i){
              found=true;
              break;
            }
        }
        if(!found){
            list.add(i);
         }
        }
        return list;
    }
}