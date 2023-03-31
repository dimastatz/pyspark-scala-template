package com.owner.sparktemplate

import org.apache.spark.sql.SparkSession
import org.scalatest.funsuite.AnyFunSuite

class TestSparkContext extends AnyFunSuite {
  test("create spark session") {
    val session = SparkSession
      .builder()
      .master("local[1]")
      .appName("lead-score-example")
      .config("spark.driver.bindAddress", "127.0.0.1")
      .getOrCreate()

    session.close()
  }
}
