class Solution {
    public int[] plusOne(int[] digits) {
        
        int size = digits.length;
        
        int[] res = recursionSol(digits, size, (size-1));
        
        return res;
        
    }
    
    
    public int[] recursionSol(int nums[], int size, int cursor){
        
        if(nums[cursor]==9){
            
            nums[cursor]=0;
            
            if(cursor!=0)
            {
                return recursionSol(nums, size, cursor-1);
            }
            else{
                 int[] res = new int[size+1];
                Arrays.fill(res,0);
                res[0] = 1;
                return res;
            }
        }
        
        else{
            
            int tmp = nums[cursor];
            nums[cursor]=tmp+1;
            return nums;
            
        }
        
    }
    
}
