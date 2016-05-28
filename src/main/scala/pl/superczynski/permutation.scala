package main.scala.pl.superczynski

object permutation {
  def main(args: Array[String]): Unit = {
    //fast but not efficient
    def solution(A: Array[Int]): Int = {
      if (A.length < 1 || A.length > 100000) 0
      else if (A.length == (A.max - A.min) + 1) 1 else 0
    }

    // efficient
    def solution2(A: Array[Int]): Int = {
      A.length match {
        case x if x == 1 => 0
        case x if x < 1 => 0
        case x if x > 100000 => 0
        case _ =>
          val list = A.toList
            .sortWith(_ < _)
            .sliding(2)
            .map(l => {
              if (l(1) - l.head == 1) 1 else 0
            })
            .count(_ == 0)
          if (list == 0) 1 else 0
      }
    }
  }
}