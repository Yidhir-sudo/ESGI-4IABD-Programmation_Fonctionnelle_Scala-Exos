package esgi.iabd.scala.seances.quatrieme

class Rectangle(val width: Double, val height: Double) {
  def area: Double = width * height
  def perimeter: Double = 2 * (width + height)
}
