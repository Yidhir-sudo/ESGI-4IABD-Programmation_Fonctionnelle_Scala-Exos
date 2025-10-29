package esgi.iabd.programmationFonctionnelle.seance2

// Séance 2 – Exercice 1: Comptage de mots
object CorrectionSeance2Ex1 {
  def main(args: Array[String]): Unit = {
    val mots = List("A", "B", "A", "C", "B", "A")

    // Version fonctionnelle avec groupBy
    val occurrences: Map[String, Int] = mots.groupBy(identity).map(x => x._1 -> x._2.length)
    println(occurrences) // Map(A -> 3, B -> 2, C -> 1)


    // Variante qui prends en compte le cas où l'entrée est vide
    val occ2: Map[String, Int] = mots.groupBy(identity).map {
      case (mot, liste) => mot -> liste.size
      case _ => "" -> 0
    }
    println(occ2) // Map(A -> 3, B -> 2, C -> 1)

    // Variante sans groupBy (foldLeft)
    val occ3 = mots.foldLeft(Map.empty[String, Int]) {
      (acc, mot) => acc + (mot -> (acc.getOrElse(mot, 0) + 1))
    }

    println(occ3) // Map(A -> 3, B -> 2, C -> 1)
  }
}
