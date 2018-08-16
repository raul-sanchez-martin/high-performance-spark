package com.highperformancespark.examples
import org.scalatest.FunSuite
import org.scalatest._

class UtilTests extends FunSuite with Matchers{

  test("remainder of 2") {
    Utils.calculate2Remainder(2) shouldBe 0
  }

  test("remainder of 5") {
    Utils.calculate2Remainder(5) shouldBe 1
  }

  test("remainder of 9") {
    Utils.calculate2Remainder(9) shouldBe 1
  }

  test("remainder of 12") {
    Utils.calculate2Remainder(12) shouldBe 0
  }

}
