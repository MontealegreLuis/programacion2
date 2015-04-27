class Circulo(r:Double) extends Figura{
  val radius = r
  var pi: Double = 3.1416
  def getArea():Double = {
    this.radius * pi
  }
}
