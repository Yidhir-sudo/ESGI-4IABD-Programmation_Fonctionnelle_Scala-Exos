package esgi.iabd.programmationFonctionnelle.seance7

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

object CorrectionExercice2 {

  def main(args: Array[String]): Unit = {
    val data = (1 to 1000000).toList
    val result = parallelSum(data)

    result.foreach(sum => println(s"Somme totale : $sum"))
    Thread.sleep(1000)
  }

  // Exercice 2
  def parallelSum(list: List[Int]): Future[Int] = {
    val (left, right) = list.splitAt(list.length / 2)
    val f1 = Future { left.sum }
    val f2 = Future { right.sum }

    for {
      a <- f1
      b <- f2
    } yield a + b
  }
}
