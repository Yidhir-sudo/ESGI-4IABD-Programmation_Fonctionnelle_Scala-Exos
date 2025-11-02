package esgi.iabd.programmationFonctionnelle.seance7

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object CorrectionExercice1 {

  def main(args: Array[String]): Unit = {

    val result = computeSquareAsync(6)

    result.onComplete {
      case Success(value) => println(s"Le carré est : $value")
      case Failure(e) => println(s"Erreur : ${e.getMessage}")
    }

    Thread.sleep(1500) // empêche la JVM de se fermer avant la fin du calcul
  }

  // Exercice 1
  def computeSquareAsync(x: Int): Future[Int] = Future {
    Thread.sleep(1000)
    x * x
  }
}
