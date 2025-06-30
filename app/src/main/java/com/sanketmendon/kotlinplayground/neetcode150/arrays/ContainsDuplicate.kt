package com.sanketmendon.kotlinplayground.neetcode150.arrays


//https://leetcode.com/problems/contains-duplicate/

fun main() {
    val input = intArrayOf(4, 2, 9, 2, 6, 7, 3)
    val result = containsDuplicate(input)
    println(result)
}

fun containsDuplicate(nums: IntArray): Boolean {
    val map = mutableSetOf<Int>()
    for (num in nums) {
        if (map.contains(num)) return true
        map.add(num)
    }
    return false
}
