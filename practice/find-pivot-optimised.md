class Solution {
    
    public static int pivotIndex(int[] nums) {
	    
	    int total=0;
	    
	    for(int i=0; i<nums.length; i++){
            
            total+=nums[i];
            
        }
        
        int leftSum =0;
        int rightSum =0;
        
        for(int i=0; i<nums.length; i++){
            
            leftSum += nums[i];
            
            rightSum = total-(leftSum-nums[i]);
            
            System.out.println("left sum"+leftSum);
            System.out.println("right sum"+rightSum);
            
            if(rightSum==leftSum){
                return i;
            }
            
        }
        return -1;
        
    }
    
}
