package esgi.iabd.programmationFonctionnelle.seances.quatrieme.classes

class Rectangle(val width: Double, val height: Double) {
  def area: Double = width * height
  def perimeter: Double = 2 * (width + height)
}
