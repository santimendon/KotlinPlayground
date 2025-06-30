package com.sanketmendon.kotlinplayground.neetcode150.arrays

import java.util.Arrays


//https://leetcode.com/problems/two-sum/description/
fun main() {
    /*val input1 = "ab"
    val input2 = "a"*/

    /*val input1 = "anagram"
    val input2 = "nagaram"*/

    val input1 = "rat"
    val input2 = "car"

    /*val input1 = "aacc"
    val input2 = "ccac"*/

    val result = isAnagram(input1, input2)
    println(result)
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val i1 = s.toCharArray()
    val i2 = t.toCharArray()
    i1.sort()
    i2.sort()
    return Arrays.equals(i1, i2)
}