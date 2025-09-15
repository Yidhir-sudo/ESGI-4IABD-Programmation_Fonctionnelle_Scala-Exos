package esgi.iabd.programmationFonctionnelle.seances.premiere

import scala.io.StdIn
import scala.util.{Random, Try}

object CorrectionSeance1Ex2 {
  def main(args: Array[String]): Unit = {
    val secret = Random.nextInt(101) // 0..100 inclus
    println("J'ai choisi un nombre entre 0 et 100. À toi de deviner !")

    var attempts = 0
    var found = false

    while (!found) {
      print("Entrer un nombre: ")
      val input = StdIn.readLine()
      val maybeInt = Try(input.trim.toInt).toOption

      maybeInt match {
        case Some(guess) if guess >= 0 && guess <= 100 =>
          attempts += 1
          if (guess < secret) println("Trop petit !")
          else if (guess > secret) println("Trop grand !")
          else {
            println(s"Bravo ! Le nombre était $secret.")
            println(s"Trouvé en $attempts tentative(s).")
            found = true
          }
        case _ =>
          println("Entrée invalide. Merci d'entrer un entier entre 0 et 100.")
      }
    }
  }
}
