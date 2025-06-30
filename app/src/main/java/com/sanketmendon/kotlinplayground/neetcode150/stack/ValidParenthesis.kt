package com.sanketmendon.kotlinplayground.neetcode150.stack

import java.util.Stack

fun main() {
    //val input = "()"
    //val input = "()[]{}"
    val input = "(]"
    val result = isValid(input)
    println(result)
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    val map = hashMapOf(")" to "(", "]" to "[", "}" to "{")
    for (char in s) {
        if (char == ')' || char == ']' || char == '}') {
            if (stack.isEmpty().not() && stack.peek().toString() == map.getValue(char.toString())) {
                stack.pop()
            }
            else {
                return false
            }
        } else {
            stack.push(char)
        }
    }

    return stack.size == 0
}