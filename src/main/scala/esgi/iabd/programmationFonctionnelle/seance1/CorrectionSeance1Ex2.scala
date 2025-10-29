package esgi.iabd.programmationFonctionnelle.seance1

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
      val guess = StdIn.readLine().trim.toInt

      if (guess < secret) println("Trop petit !")
      else if (guess > secret) println("Trop grand !")
      else {
        println(s"Bravo ! Le nombre était $secret.")
        println(s"Trouvé en $attempts tentative(s).")
        found = true
      }
    }
  }
}
