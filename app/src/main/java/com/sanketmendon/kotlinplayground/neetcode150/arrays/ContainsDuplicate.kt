package com.sanketmendon.kotlinplayground.neetcode150.arrays


//https://leetcode.com/problems/contains-duplicate/

fun main() {
    val input = intArrayOf(4, 0, 9, 2, 0, 0, 3)
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

/*
class MainActivity {
    fun main() {
        var input = intArrayOf(4, 0, 9, 2, 0, 0, 3)
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
}*/
