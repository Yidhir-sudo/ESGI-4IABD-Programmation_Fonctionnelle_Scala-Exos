package esgi.iabd.programmationFonctionnelle.seance6

import esgi.iabd.programmationFonctionnelle.seance6.classes.{Circle, Shape, Rectangle}

object CorrectionSeance6 {
  def main(args: Array[String]): Unit = {

    // Exercice 1
    println(firstElement(List(1, 2, 3)))     // Some(1)
    println(firstElement(List("Scala", "Java"))) // Some(Scala)
    println(firstElement(List()))            // None

    // Exercice 2
    val shapes = List(new Circle(2.0), new Rectangle(3.0, 4.0))
    println(totalArea(shapes)) // 4π + 12 ≈ 24.57
  }

  def firstElement[T](list: List[T]): Option[T] =
    list.headOption

  def totalArea(shapes: List[Shape]): Double =
    shapes.map(_.area).sum
}


