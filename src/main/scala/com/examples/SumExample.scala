package com.examples

/**
  * Sum function implementations
  */
object SumExample extends App {
  /**
    * sum implementation
    * @param xs list of integers
    * @return sum of list elements
    */
  def sum(xs: List[Int]): Int = {
     // if (xs.isEmpty) 0 else xs.head + sum(xs.tail)
    if (xs.isEmpty) {
      0
    } else {
      xs.head + sum(xs.tail)
    }
  }

  /**
    * sum implementation using pattern matching
    * @param xs list of integers
    * @return sum of list elements
    */
  def sumPM(xs: List[Int]): Int = xs match {
    case Nil => 0
    case n :: rest => n + sumPM(rest)
  }

  println(sum(List(1, 2, 3)))
  println(sumPM(List(1, 2, 3)))
}
