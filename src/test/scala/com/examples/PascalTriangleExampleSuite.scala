package com.examples

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalTriangleExampleSuite extends FunSuite {

  import com.examples.PascalTriangleExample._

  test("pascal: col=1..4, row=1..4") {
    assert(pascal(0, 0) === 1)
    assert(pascal(0, 1) === 1)
    assert(pascal(1, 1) === 1)
    assert(pascal(0, 2) === 1)
    assert(pascal(1, 2) === 2)
    assert(pascal(2, 2) === 1)
    assert(pascal(0, 3) === 1)
    assert(pascal(1, 3) === 3)
    assert(pascal(2, 3) === 3)
    assert(pascal(3, 3) === 1)
    assert(pascal(0, 4) === 1)
    assert(pascal(1, 4) === 4)
    assert(pascal(2, 4) === 6)
    assert(pascal(3, 4) === 4)
    assert(pascal(4, 4) === 1)
  }

  test("pascalPM: col=1..4, row=1..4") {
    assert(pascalPM(0, 0) === 1)
    assert(pascalPM(0, 1) === 1)
    assert(pascalPM(1, 1) === 1)
    assert(pascalPM(0, 2) === 1)
    assert(pascalPM(1, 2) === 2)
    assert(pascalPM(2, 2) === 1)
    assert(pascalPM(0, 3) === 1)
    assert(pascalPM(1, 3) === 3)
    assert(pascalPM(2, 3) === 3)
    assert(pascalPM(3, 3) === 1)
    assert(pascalPM(0, 4) === 1)
    assert(pascalPM(1, 4) === 4)
    assert(pascalPM(2, 4) === 6)
    assert(pascalPM(3, 4) === 4)
    assert(pascalPM(4, 4) === 1)
  }

  test("pascalTR: col=1..4, row=1..4") {
    assert(pascalTR(0, 0) === 1)
    assert(pascalTR(0, 1) === 1)
    assert(pascalTR(1, 1) === 1)
    assert(pascalTR(0, 2) === 1)
    assert(pascalTR(1, 2) === 2)
    assert(pascalTR(2, 2) === 1)
    assert(pascalTR(0, 3) === 1)
    assert(pascalTR(1, 3) === 3)
    assert(pascalTR(2, 3) === 3)
    assert(pascalTR(3, 3) === 1)
    assert(pascalTR(0, 4) === 1)
    assert(pascalTR(1, 4) === 4)
    assert(pascalTR(2, 4) === 6)
    assert(pascalTR(3, 4) === 4)
    assert(pascalTR(4, 4) === 1)
  }
}
