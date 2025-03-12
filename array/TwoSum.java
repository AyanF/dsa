/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();

        System.out.println(numMap.entrySet());

        for(int i=0; i<nums.length; i++ ){
            
            int rem = target-nums[i];
            System.out.println("remainder no."+i+" "+rem);

            if(numMap.containsKey(rem)){
                return new int[]{numMap.get(rem),i};
            }

            numMap.put(nums[i],i);

        }

        return new int[]{-1,-1};

    }
}
