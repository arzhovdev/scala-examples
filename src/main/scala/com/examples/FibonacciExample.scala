package com.examples

import scala.annotation.tailrec

/**
  * Fibonacci numbers calculation
  */
object FibonacciExample {
  /**
    * Calculate n-th fibonacci number
    *
    * @param n fibonacci number index
    * @return n-th fibonacci number
    */
  def fibonacci(n: Int): Int = {
    @tailrec
    def loop(n: Int, y: (Int, Int)): Int = n match {
      case 0 => 0
      case 1 => 1
      case 2 => y._1 + y._2
      case _ => loop(n - 1, (y._2, y._1 + y._2))
    }

    loop(n, (0, 1))
  }

  /**
    * Calculate first <code>n</code> fibonacci numbers
    *
    * @param n fibonacci numbers count
    * @return list of first <code>n</code> fibonacci numbers
    */
  def fibonacciList(n: Int): List[Int] = {
    @tailrec
    def loop(n: Int, y: (Int, Int), fibs: List[Int]): List[Int] = n match {
      case 2 => 0 :: 1 :: fibs
      case _ => {
        val f = y._1 + y._2
        loop(n - 1, (y._2, f), fibs :+ f)
      }
    }

    loop(n, (0, 1), List())
  }

  /**
    * Calculate first <code>n</code> fibonacci numbers using Functional Programming laziness.
    * Stream is a lazily computed data structure evaluated on an as-needed basis and only up to the point that you need it.
    *
    * @param n fibonacci numbers count
    * @return stream of first <code>n</code> fibonacci numbers
    */
  def fibonacciLazyStream(n: Int): Stream[BigInt] = {
    lazy val fibs: Stream[BigInt] = 0 #:: 1 #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

    fibs.take(n)
  }

  /**
    * Calculate <code>a</code> to <code>b</code> fibonacci numbers using Functional Programming laziness.
    *
    * @param n fibonacci numbers count
    * @return stream of first <code>n</code> fibonacci numbers
    * @version 2
    */
  def fibonacciLazyStream2(n:Int): Stream[BigInt] = {
    def loop(a: Int, b: Int): Stream[BigInt] = {
      a #:: loop(b, a + b)
    }

    loop(0, 1).take(n)
  }
}
