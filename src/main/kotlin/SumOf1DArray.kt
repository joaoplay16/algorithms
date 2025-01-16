/*
* Given an array nums. We define a running sum of an array
* as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
* */
fun main() {
    fun runningSum(nums: IntArray): IntArray {
        for((index, num) in nums.withIndex()){
            if(index != 0 )
                nums.set(index, num + nums[index - 1])
//                nums[index] = num + nums[index - 1]
        }
        return nums
    }


    println(runningSum(intArrayOf(1,2,3,4,5)).toList())
}