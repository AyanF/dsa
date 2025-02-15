class Solution {
    
    public int pivotIndex(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            
            int pivot = nums[i];
            
            int firsthalf = sum(nums, 0, i);
            int secondhalf = sum(nums, i+1, nums.length);
            
            if(firsthalf-secondhalf==0){
                return i;
            }
        }
        return -1;
        
    }
    
    public int sum(int[] nums, int start, int end){
        
        int sum = 0;
        
        for(int i=start; i<end; i++){
            
            sum += nums[i];
                
        }
        System.out.println(sum);
        return sum;
        
    }
    
}
