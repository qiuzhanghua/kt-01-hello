package com.example

/**
 * Created by qiuzhanghua on 16/2/20.
 */

class Invoice {}

class Empty

// class Person constructor(firstName: String) {}
// or
// class Person(firstName: String) {}

class Customer(name: String) {
  init {
    // initializer blocks
    println("Customer initialized with value ${name}")
  }
}

open class Person(val firstName: String, val lastName: String, var age: Int) {
  var children = mutableListOf<Person>();

  // secondary constructor
  constructor(firstName: String, lastName: String, age: Int, parent: Person) : this(firstName, lastName, age) {
    parent.children.add(this)
  }

  override fun toString(): String {
    return "Person(firstName = $firstName, lastName = $lastName, age = $age)"
  }
}

// class inherited
class Man(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age)

fun main(args: Array<String>) {
  val dad = Person("dad", "family", 90)
  val son = Person("son", "family", 50, dad)
  println(dad)
  println(son)
}