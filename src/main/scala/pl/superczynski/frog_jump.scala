package main.scala.pl.superczynski

/**
  * Created by sebastian on 27/05/16.
  */
object frog_jump {
  def main(args: Array[String]): Unit = {
    def jump(X: Int, Y: Int, D: Int): Int = {
      math.ceil((Y - X).toDouble / D.toDouble).toInt
    }

    println(jump(10, 85, 30)) // expected 3
    println(jump(3, 999111321, 7), 142730189) //expected 142730189

    assert(jump(10, 85, 30) == 3)
    assert(jump(3, 999111321, 7) == 142730189)
  }
}
