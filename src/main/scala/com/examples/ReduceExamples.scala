package com.examples

import com.examples.FP._

/**
  * Functional programming - reduce usage examples
  */
object ReduceExamples {
  /**
    * Calculate sum of list's elements.
    *
    * @param xs List
    * @return sum of list's elements
    */
  def sum(xs: List[Int]): Int = {
    reduce((x: Int, y: Int) => x + y, 0, xs)
  }

  /**
    * Calculate product of list's elements.
    *
    * @param xs List
    * @return product of list's elements
    */
  def product(xs: List[Int]): Int = {
    reduce((x: Int, y: Int) => x * y, 1, xs)
  }

  /**
    * Count length of list.
    *
    * @param xs List
    * @tparam T generic type
    * @return length of given list
    */
  def length[T](xs: List[T]): Int = {
    // version using right reduce
    //    reduceRight((x: T, y: Int) => 1 + y, 0, xs)

    // version using left reduce
    reduceLeft((x: T, y: Int) => 1 + y, 0, xs)
  }

  /**
    * Append two list.
    *
    * @param a List
    * @param b List
    * @tparam T generic type
    * @return appended List
    */
  def append[T](a: List[T], b: List[T]): List[T] = {
    reduce(cons[T], b, a)
  }

  /**
    * Remove odd elements from list
    *
    * @param xs List
    * @return even elements of list
    */
  def removeOdds[T](xs: List[T]): List[T] = {
    def f(x: T, y: (Int, List[T])): (Int, List[T]) = {
      if (y._1 % 2 == 0) (y._1 + 1, y._2)
      else (y._1 + 1, x :: y._2)
    }

    reduce(f, (0, List()), xs)._2
  }

  /**
    * Remove odd elements from list
    *
    * @param xs List
    * @return even elements of list
    * @version 2
    */
  def removeOdds2[T](xs: List[T]): List[T] = {
    def f(x: T, y: (Boolean, List[T])): (Boolean, List[T]) = {
      if (y._1) (!y._1, x :: y._2)
      else (!y._1, y._2)
    }

    reduce(f, (false, List()), xs)._2
  }

}
