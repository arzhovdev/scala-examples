package com.examples

import scala.annotation.tailrec

object PascalTriangleExample {
  /**
    * calculate Pascal's Triangle cell value
    *
    * @param col - column number
    * @param row - row number
    * @return
    */
  def pascal(col: Int, row: Int): Int = {
    if (col == 0 || col == row) 1
    else {
      pascal(col - 1, row - 1) + pascal(col, row - 1)
    }
  }

  /**
    * calculate Pascal's Triangle cell value using pattern matching
    *
    * @param col - column number
    * @param row - row number
    * @return
    */
  def pascalPM(col: Int, row: Int): Int = (col, row) match {
    case (0, _) => 1
    case (`col`, `row`) if col == row => 1
    case (_, _) => pascalPM(col - 1, row - 1) + pascalPM(col, row - 1)


  }

  /**
    * calculate Pascal's Triangle cell value using tail recursion
    *
    * @param col - column number
    * @param row - row number
    * @return
    */
  def pascalTR(col: Int, row: Int): Int = {
    val l = if (col > row / 2) col else row - col
    @tailrec
    def go(i: Int, acc: Int): Int = {
      if (i == l + 1) acc
      else go(i + 1, acc * (row - l + i) / i)
    }
    go(1, 1)
  }

/*
  def main(args: Array[String]) {
    val num = 10 //scala.io.StdIn.readInt()

    for (row <- 0 to num - 1) {
      for (col <- 0 to row)
        print("%d ".format(pascalTR(col, row)))
      println()
    }
  }
  */
}
