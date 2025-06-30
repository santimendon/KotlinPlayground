package com.sanketmendon.kotlinplayground.neetcode150.slidingwindow


//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
fun main() {
    //val input = "abcabcbb"
    //val input = "dvdf"
    val input = "pwwkew"
    val result = lengthOfLongestSubstring(input)
    println(result)
}

fun lengthOfLongestSubstring(s: String): Int {
    var leftP = 0
    val set = mutableSetOf<Char>()
    var maxLength = 0
    val array = s.toCharArray()

    for (rightP in 0..array.size - 1) {
        while (set.contains(array[rightP])) {
            set.remove(array[leftP])
            leftP += 1
        }
        set.add(array[rightP])
        maxLength = Math.max(maxLength, rightP - leftP + 1)
    }
    return maxLength
}