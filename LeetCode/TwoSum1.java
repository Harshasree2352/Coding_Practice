// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            System.out.println("---------- "+diff);
            if(map.containsKey(nums[i])){  
                int valueA = map.get(nums[i]);
                return new int[]{i, valueA};
            }
            else{
                map.put(diff, i);
            }

        }
        return null;
    }
}