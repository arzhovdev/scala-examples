package com.examples

import scala.annotation.tailrec

object FP {
  def reduce[T, U](f: (T, U) => U, z: U, xs: List[T]): U = reduceRight[T, U](f: (T, U) => U, z: U, xs: List[T])

  /**
    * reduce right
    */
  def reduceRight[T, U](f: (T, U) => U, z: U, xs: List[T]): U = {
    if (xs.isEmpty) z
    else f(xs.head, reduceRight(f, z, xs.tail))
  }


  /**
    * reduce left
    */
  @tailrec
  def reduceLeft[T, U](f: (T, U) => U, z: U, xs: List[T]): U = {
    if (xs.isEmpty) z
    else reduceLeft(f, f(xs.head, z), xs.tail)
  }

  def cons[T](head: T, tail: List[T]): List[T] = head :: tail

}
