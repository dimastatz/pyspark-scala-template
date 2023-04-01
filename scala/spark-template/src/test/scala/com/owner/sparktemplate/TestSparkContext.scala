package com.owner.sparktemplate

import scala.util._
import org.scalatest.funsuite._


class TestSparkContext extends AnyFunSuite {
  test("create spark session") {
    val session = Boot.createSparkSession()
    assert(session.isSuccess)
    session match {
      case Success(session) => session.close()
      case Failure(exception) => print(exception.printStackTrace())
    }
  }
}
