package uit.islab.hello

import scala.collection.immutable.Set
import scala.collection.immutable.SortedSet

object HelloScala {
  def main(args: Array[String]): Unit = {
    val setExample = SortedSet(1, 2, 3, 4, 5, 6, 7, 8, 9)
    setExample map { x => println(x+1) }
    println()
    println(setExample.product)
    println()
    setExample foreach { var re = 1; x => re = re * x; println(re)}
    println("Hello Scala!")
  }
}
