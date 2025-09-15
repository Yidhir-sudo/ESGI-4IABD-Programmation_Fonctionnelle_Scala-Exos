package esgi.iabd.programmationFonctionnelle.seances.deuxieme

// Séance 2 – Exercice 1: Comptage de mots
object CorrectionSeance2Ex1 {
  def main(args: Array[String]): Unit = {
    val mots = List("A", "B", "A", "C", "B", "A")

    // Version fonctionnelle avec groupBy
    val occurrences: Map[String, Int] = mots.groupBy(identity).map {
      case (mot, liste) => mot -> liste.size
    }

    println(occurrences) // Map(A -> 3, B -> 2, C -> 1)

    // Variante sans groupBy (foldLeft)
    val occ2 = mots.foldLeft(Map.empty[String, Int]) {
      (acc, mot) => acc + (mot -> (acc.getOrElse(mot, 0) + 1))
    }

    println(occ2) // Map(A -> 3, B -> 2, C -> 1)
  }
}
