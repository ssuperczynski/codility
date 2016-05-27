package main.scala.pl.superczynski

/**
  * Created by Sebastian Superczynski on 27/05/16.
  */
object cyclic {
  def main(args: Array[String]): Unit = {

    val A: List[Int] = List(3, 8, 9, 7, 6)
    val K = 3
    Stream
      .continually(A.reverse)
      .flatten
      .sliding(A.size)
      .map(_.reverse)
      .slice(K, K + 1)
      .toList
      .map(x => x.toList)
      .head
  }
}
