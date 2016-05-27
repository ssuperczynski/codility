package main.scala.pl.superczynski

object permutation {
  def main(args: Array[String]): Unit = {
    def solution(A: Array[Int]): Int = {
      if (A.length == (A.max - A.min) + 1) 1 else 0
    }

    println(solution(Array(4, 1, 3, 2)))
  }
}