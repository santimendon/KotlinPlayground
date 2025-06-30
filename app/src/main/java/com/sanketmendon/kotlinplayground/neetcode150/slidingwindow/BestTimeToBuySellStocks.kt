package com.sanketmendon.kotlinplayground.neetcode150.slidingwindow

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
fun main() {
    val input = intArrayOf(7,1,5,3,6,4)
    val result = maxProfit(input)
    println(result)
}

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var min = prices[0]

    for (price in prices) {
        min = Math.min(min, price)
        val currentProfit = price - min
        profit = Math.max(profit, currentProfit)
    }
    return profit
}