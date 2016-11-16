package com.examples

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumExampleSuite extends FunSuite {

  import SumExample._

  test("sum of empty list") {
    assert(sum(List[Int]()) === 0)
  }

  test("sum of a few numbers") {
    assert(sum(List(1, 2, 3, 4, 5)) === 15)
    assert(sum(List(1, -2, 3, -4, 5)) === 3)
  }

  test("sumPM of empty list") {
    assert(sumPM(List[Int]()) === 0)
  }

  test("sumPM of a few numbers") {
    assert(sumPM(List(1, 2, 3, 4, 5)) === 15)
    assert(sumPM(List(1, -2, 3, -4, 5)) === 3)
  }

  test("sumTR of empty list") {
    assert(sumTR(List[Int]()) === 0)
  }

  test("sumTR of a few numbers") {
    assert(sumTR(List(1, 2, 3, 4, 5)) === 15)
    assert(sumTR(List(1, -2, 3, -4, 5)) === 3)
  }

}
