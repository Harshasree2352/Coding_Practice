/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) 
{
    let hp = new Map();
    for(let i = 0; i < nums.length; i++) 
    {
        if(hp.has(target - nums[i])) 
        {
            return [hp.get(target - nums[i]), i];
        }
        hp.set(nums[i], i);
    }
    return [];
};