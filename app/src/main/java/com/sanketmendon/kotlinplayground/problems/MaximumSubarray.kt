package com.sanketmendon.kotlinplayground.problems


/**
 * Created by Sanket Mendon on 26/06/25
 * sanket@cheq.one,
 * CheQ Digital Private Limited
 *
 */


//https://leetcode.com/problems/maximum-subarray/description/
fun main() {
    val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result = maxSubArray(input)
    println(result)
}

fun maxSubArray(nums: IntArray): Int {
    var currentMax = nums[0]
    var globalMax = nums[0]
    for (i in 1 until nums.size) {
        currentMax = maxOf(nums[i], currentMax + nums[i])
        globalMax = maxOf(globalMax, currentMax)
    }
    return globalMax
}