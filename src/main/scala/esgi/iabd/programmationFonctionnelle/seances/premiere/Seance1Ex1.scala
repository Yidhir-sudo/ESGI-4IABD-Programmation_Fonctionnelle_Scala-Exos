package esgi.iabd.programmationFonctionnelle.seances.premiere

// Séance 1 – Exercice 1: Affichage simple
object Seance1Ex1 {
  def main(args: Array[String]): Unit = {
    val name: String = "Yidhir" // vous pouvez changer la valeur
    println(s"Bonjour $name")
    for (i <- 1 to 10) println(i)
  }
}
