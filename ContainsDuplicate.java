/**
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

/**
The containsDuplicate method takes an integer array nums as input and returns a boolean value indicating whether any value appears at least twice in the array.

We create a Set<Integer> called set to keep track of unique elements in the array. We iterate through the array using a for loop and for each element, we check if it already exists in the set using the contains method. If it does, we know that the element has already appeared in the array and we return true. Otherwise, we add the element to the set and continue with the loop.

If we reach the end of the loop without finding any duplicates, we return false to indicate that all elements are distinct.
*/