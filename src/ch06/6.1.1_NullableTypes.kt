package ch06.ex1_1_NullableTypes

import java.util.*

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun strLen(s: String): Int = s.length

fun main(args: Array<String>) {
    var scanner: Scanner = Scanner(System.`in`)
    val x: String = scanner.nextLine()
    var nullString = null
    //var nullString: String = null
    //var nullString: String? = null
    println(strLen(x))
    //println(strLen(nullString))
    println(strLenSafe(nullString))
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}
