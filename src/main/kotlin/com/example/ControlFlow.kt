package com.example

/**
 * Created by qiuzhanghua on 16/2/20.
 */

fun main(args: Array<String>) {
  val a = 3
  val b = 4

  // if is an expression,  it returns a value.
  val m1 = if (a > b) a else b

  val m2 = if (a > b) {
    println(a)
    a
  } else {
    println(a)
    b
  }

  println()
  val x = 5

  when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
      // Note the block
      print("x is neither 1 nor 2")
    }
  }

  println()
  when (x) {
    0, 1 -> print("x == 0 or x == 1")
    else -> print("otherwise")
  }

  println()
  val validNumbers = intArrayOf(7, 8, 9)
  when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
  }

  var s = "some"
  var hasPrefix = when (s) {
    is String -> s.startsWith("prefix")  // type check and cast
    else -> false
  }

  println()
  when {
    x.mod(2) == 1 -> print("x is odd")
    x.mod(2) == 0 -> print("x is even")
    else -> print("x is funny")
  }


  println()
  val array = arrayOf(3, 4, 5)
  for (i in array) {
    println(i)
  }

  for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
  }

  var y: Int = 4
  while (y > 0) {
    y--
  }

  do {
    val z = false
  } while (z)


  loop@ for (i in 1..10) {
    for(j in 1..10) {
      if (j.mod(3) == 0) break@loop
      println("i = $i, j = $j")
    }
  }
  /**
   * i = 1, j = 1
   * i = 1, j = 2
   */

}