package main.scala.pl.superczynski

/**
  * Created by sebastian on 27/05/16.
  */
object frog_jump {
  def main(args: Array[String]): Unit = {
    def jump(X: Int, Y: Int, D: Int): Int = {
      math.ceil((Y - X).toFloat / D.toFloat).toInt
    }

    println(jump(10, 85, 30))
  }
}
