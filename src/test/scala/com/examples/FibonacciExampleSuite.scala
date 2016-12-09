package com.examples

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FibonacciExampleSuite extends FunSuite {

  import com.examples.FibonacciExample._

  test("fibonacci") {
    assert(fibonacci(0) === 0)
    assert(fibonacci(1) === 1)
    assert(fibonacci(2) === 1)
    assert(fibonacci(3) === 2)
    assert(fibonacci(4) === 3)
    assert(fibonacci(5) === 5)
    assert(fibonacci(6) === 8)
    assert(fibonacci(7) === 13)
  }

  test("fibonacci numbers list") {
    assert(fibonacciList(8) === List(0, 1, 1, 2, 3, 5, 8, 13))
  }

  test("fibonacci numbers lazy stream") {
    assert(fibonacciLazyStream(8) === Stream(0, 1, 1, 2, 3, 5, 8, 13))
  }

  test("fibonacci numbers lazy stream version 2") {
    assert(fibonacciLazyStream2(8) === Stream(0, 1, 1, 2, 3, 5, 8, 13))
  }
}
