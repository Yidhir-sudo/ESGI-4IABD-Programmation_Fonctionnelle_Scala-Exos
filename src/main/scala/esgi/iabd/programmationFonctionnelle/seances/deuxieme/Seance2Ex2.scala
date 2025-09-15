package esgi.iabd.programmationFonctionnelle.seances.deuxieme

// Séance 2 – Exercice 2: Comparaison List vs Vector
object Seance2Ex2 {
  def main(args: Array[String]): Unit = {
    val n = 100000
    val liste = List.fill(n)(0)
    val vecteur = Vector.fill(n)(0)

    // Mesure du temps d'exécution
    def tempsExecution(operation: => Unit): Long = {
      val t0 = System.nanoTime()
      operation
      val t1 = System.nanoTime()
      (t1 - t0) / 1000000 // ms
    }

    // Ajout en tête
    val tempsListeHead = tempsExecution {
      0 +: liste
    }
    val tempsVectorHead = tempsExecution {
      0 +: vecteur
    }

    // Ajout en fin
    val tempsListeTail = tempsExecution {
      liste :+ 0
    }
    val tempsVectorTail = tempsExecution {
      vecteur :+ 0
    }

    println(s"Ajout en tête : List = $tempsListeHead ms, Vector = $tempsVectorHead ms")
    println(s"Ajout en fin  : List = $tempsListeTail ms, Vector = $tempsVectorTail ms")
  }
}
