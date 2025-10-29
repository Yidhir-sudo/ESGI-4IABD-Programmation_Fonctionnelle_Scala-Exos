package esgi.iabd.programmationFonctionnelle.seance5

object CorrectionSeance5 {

  def main(args: Array[String]): Unit = {

    // Exercice 1
    println(describe(5))             // Nombre positif
    println(describe(""))            // Chaîne vide
    println(describe(List(1, 2, 3))) // Liste de longueur 3
    println(describe(3.14))          // Type inconnu

    // Exercice 2
    println(safeSqrt(9))             // Right(3.0)
    println(safeSqrt(-4))            // Left(Nombre négatif)
  }

  // Exercice 1
  def describe(x: Any): String = x match {
    case i: Int if i > 0 => "Nombre positif"
    case s: String if s.isEmpty => "Chaîne vide"
    case l: List[_] => s"Liste de longueur ${l.length}"
    case _ => "Type inconnu"
  }

  // Exercice 2
  def safeSqrt(x: Double): Either[String, Double] =
    if (x < 0) Left("Nombre négatif")
    else Right(math.sqrt(x))
}
