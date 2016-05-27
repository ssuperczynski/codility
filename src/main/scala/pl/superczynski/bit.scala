package main.scala.pl.superczynski

/**
  * Created by sebastian on 27/05/16.
  */
object bit {

  def toInt(seq: Option[String]) = {
    seq match {
      case Some(s) => s.length()
      case None => 0
    }
  }

  def main(args: Array[String]): Unit = {
    val number: Int = 1024
    val seq = number
      .toBinaryString
      .reverse
      .dropWhile(_ == 0)
      .reverse
      .split("1")
      .toList
      .sorted
      .reverse
      .headOption

    toInt(seq)
  }
}
