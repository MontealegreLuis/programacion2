package tareas.calculo
class Rectangulo(alt:Double,bas:Double) extends Figura{
  val altura = alt
  val base = bas
    def obtenerArea():Double = {
        this.altura * this.base
    }
}