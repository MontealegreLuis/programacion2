class Rectangulo(l:Double,w:Double) extends Figura{
  val length = l
  val width = w
  def getArea():Double = {
    this.width * this.length
  }
}