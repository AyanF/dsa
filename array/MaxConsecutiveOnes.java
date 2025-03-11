/*Given a binary array nums, return the maximum number of consecutive 1's in the array.*/

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int left=0;
        int right=0;
        int maxOnes=0;
        
        while(right<nums.length){
            
            if(1==nums[right]){
                right++;
            }
            else{
                
                maxOnes = Math.max(maxOnes, right-left);
                
                right++;
                left = right;
                
            }
            
        }
        
        return Math.max(maxOnes,right-left);
    }
}

