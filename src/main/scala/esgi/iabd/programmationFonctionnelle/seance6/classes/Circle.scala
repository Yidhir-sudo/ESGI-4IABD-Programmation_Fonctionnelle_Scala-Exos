package esgi.iabd.programmationFonctionnelle.seance6.classes

class Circle(val r: Double) extends Shape {
  def area: Double = math.Pi * r * r
}