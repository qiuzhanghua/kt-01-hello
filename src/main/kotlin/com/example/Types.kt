package com.example

/**
 * Created by qiuzhanghua on 16/2/20.
 */

val d: Double = Math.PI
val f: Float = 2.718f
val l: Long = 1234
val i: Int = 64
val b: Byte = 0x40
val c: Char = '中'
val bool: Boolean = false


val a1 = arrayOf(1, 2, 3)   // Array<Int>
val a2 = arrayOfNulls<Int>(size = 3)

val a3 = Array(5) { it -> (it * it).toString() } // Array<String>
val a3p = Array(5, { it -> (it * it).toString() })  // same as above

val a4: IntArray = intArrayOf(1, 2, 3) // ShortArray, ByteArray etc, avoid box/unbox

val s: String = "i = ${'$'}$i"  // how to interpolate $ in String template

fun main(args: Array<String>) {
    println(b.toInt() == i)   // can't write code as b == i
    val anotherLong: Long? = i.toLong() // can't write anotherLong = i
    // val anotherLong1: Long? = i
    i.toChar()
    println("$c toInt = ${c.toInt()}")
    println("$i << 2 = ${i shl 2}")
    println(a3[3])
    println(s)

}
