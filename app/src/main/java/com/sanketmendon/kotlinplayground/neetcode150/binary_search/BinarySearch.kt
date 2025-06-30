package com.sanketmendon.kotlinplayground.neetcode150.binary_search

fun main() {

    val input = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 9
    val result = search(input, target)
    println(result)
}

fun search(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> low = mid + 1
            else -> high = mid - 1
        }
    }

    return -1
}