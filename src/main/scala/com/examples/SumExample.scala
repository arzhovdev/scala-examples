package com.examples

import scala.annotation.tailrec

/**
  * Sum function implementations
  */
object SumExample {
  /**
    * sum implementation
    *
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
    *
    * @param xs list of integers
    * @return sum of list elements
    */
  def sumPM(xs: List[Int]): Int = xs match {
    case Nil => 0
    case n :: rest => n + sumPM(rest)
  }

  /**
    * sum implementation using tail recursion & pattern matching
    *
    * @param xs list of integers
    * @return sum of list elements
    */
  def sumTR(xs: List[Int]): Int = {
    @tailrec
    def sumWithAccumulator(accumulator: Int, xs: List[Int]): Int = xs match {
      case Nil => accumulator
      case n :: rest => sumWithAccumulator(accumulator + n, rest)
    }

    sumWithAccumulator(0, xs)
  }
}
