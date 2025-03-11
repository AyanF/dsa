/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.*/

class MinSubArray {
    
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0; // Left boundary of the sliding window
        int sum = 0;  // Current sum of elements inside the window
        
        int minLength = Integer.MAX_VALUE; // Stores the minimum subarray length found

        // Right pointer expands the window
        for (int right = 0; right < nums.length; right++) {
            
            sum += nums[right]; // Add the current element to the sum
            
            System.out.println("Added " + nums[right] + ", New Sum: " + sum);

            // While sum is greater than or equal to target, shrink the window from left
            while (sum >= target) {
                // Calculate the current window size
                int currentLength = right - left + 1;
                minLength = Math.min(minLength, currentLength); 

                System.out.println("Valid Window [" + left + "," + right + "] -> Size: " + currentLength);
                System.out.println("Removing " + nums[left] + " from sum");
                
                // Shrink the window from left
                sum -= nums[left];
                left++; // Move left pointer forward
            }
        }

        // If no valid subarray is found, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}

