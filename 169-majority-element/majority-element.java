class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority=nums[0];
        int prevcount=1;
        int count=1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(prevcount<count){
                prevcount=count;
                majority=nums[i];
            }
        }
        return majority;
    }
}