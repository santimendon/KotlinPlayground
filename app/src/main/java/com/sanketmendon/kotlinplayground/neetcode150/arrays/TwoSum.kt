package com.sanketmendon.kotlinplayground.neetcode150.arrays

//https://leetcode.com/problems/two-sum/submissions/1676985948/
fun main() {

    val input = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(input, target = target)
    println(result.joinToString(","))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (i in 0..nums.size) {
        val difference = target - nums[i]
        if (map.contains(key = difference)) return intArrayOf(i, map.getValue(difference))
        map.put(nums[i], i)
    }
    return intArrayOf()
}