package esgi.iabd.programmationFonctionnelle.seance1

object CorrectionSeance1Ex2_versionAmelioree {
  def main(args: Array[String]): Unit = {
    val secret = Random.nextInt(101) // 0..100 inclus
    println("J'ai choisi un nombre entre 0 et 100. À toi de deviner !")

    var attempts = 0
    var found = false

    while (!found && attemps <= 10) {
      print("Entrer un nombre: ")

      val maybeInt = Try(StdIn.readLine().trim.toInt).toOption

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
          attempts += 1
          println("Entrée invalide. Merci d'entrer un entier entre 0 et 100.")
      }
    }
    if (attemps > 10)
      println("Vous avez atteint le nombre maximal de tentatives. Le chiffre mystere était : "+secret)
  }
}
