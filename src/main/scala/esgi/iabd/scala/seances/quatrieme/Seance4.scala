package esgi.iabd.scala.seances.quatrieme

object Seance4 {

  def main(args: Array[String]): Unit = {
    // Exemple d’utilisation exercice 1
    val rect = new Rectangle(5.0, 3.0)
    println(s"Aire: ${rect.area}")           // Aire: 15.0
    println(s"Périmètre: ${rect.perimeter}") // Périmètre: 16.0

    // Exemple d’utilisation exercice 2
    val vehicles: List[Vehicle] = List(new Car(), new Bike(), new Vehicle())

    vehicles.foreach(_.move())
  }
}
