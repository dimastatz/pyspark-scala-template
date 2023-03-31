package com.owner.sparktemplate

import scala.util._
import org.apache.spark.sql._

object Boot {
  // TODO: take properties from conf file
  def createSparkSession(): SparkSession = {
    SparkSession
      .builder()
      .master("local[1]")
      .appName("spark-template")
      .config("spark.driver.bindAddress", "127.0.0.1")
      .getOrCreate()
  }

  def main(args: Array[String]): Unit = {
    println("Starting Spark-Template App")
    Try(createSparkSession()) match {
      case Success(session) =>
        println("Hello SparkSession")
        session.close()
      case Failure(exception) =>
        println(s"Failed creating SparkSession $exception")
    }
    println("Shutting down Spark-Template App")
  }
}
