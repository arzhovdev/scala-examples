package com.examples

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ReduceExamplesSuite extends FunSuite {

  import com.examples.ReduceExamples._

  trait ListData {
    val emptyList: List[Int] = List[Int]()
    val intListData: List[Int] = List(1, 2, 3, 4, 5)
    val stringListData: List[String] = List("a", "b", "c")
  }

  test("sum reduce empty list") {
    new ListData() {
      assert(sum(emptyList) === 0)
    }
  }

  test("sum reduce int list") {
    new ListData() {
      assert(sum(intListData) === 15)
    }
  }

  test("product reduce int list") {
    new ListData() {
      assert(product(intListData) === 120)
    }
  }

  test("length reduce list") {
    new ListData() {
      assert(length(intListData) === 5)
      assert(length(stringListData) === 3)
    }
  }

  test("append reduce list") {
    val appendList: List[Int] = append(List(1, 2, 3), List(4, 5))
    println(appendList)
    assert(appendList.length === 5)
    assert(appendList.contains(1))
    assert(appendList.contains(2))
    assert(appendList.contains(3))
    assert(appendList.contains(4))
    assert(appendList.contains(5))
  }

  test("removeOdds") {
    assert(removeOdds(List(1, 2, 3, 4, 5, 6, 7)) === List(2, 4, 6))
  }

  test("removeOdds2") {
    assert(removeOdds2(List(1, 2, 3, 4, 5, 6, 7)) === List(2, 4, 6))
  }

}
