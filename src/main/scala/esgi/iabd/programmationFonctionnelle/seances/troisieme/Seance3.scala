package esgi.iabd.programmationFonctionnelle.seances.troisieme

object Seance3 {

  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5, 6)
    val result = processNumbers(nums)
    println(result)

    val text = "Scala is great and Scala is functional"
    val wordCounts = textPipeline(text)
    println(wordCounts)
  }

  // Exercice 1
  def processNumbers(nums: List[Int]): Int = {
    nums
      .filter(_ % 2 == 0) // garder uniquement les pairs
      .map(_ * 3)         // multiplier par 3
      .sum                // sommer le tout
  }

  // Exercice 2
  def textPipeline(text: String): Map[String, Int] = {
    text
      .split("\\s+")          // découper en mots
      .map(_.toLowerCase)            // passer en minuscules
      .filter(_.length >= 4)         // garder que les mots de taille ≥ 4
      .groupBy(identity)             // regrouper par mot
      .map(x => x._1 -> x._2.length) // compter les occurrences
  }
}
