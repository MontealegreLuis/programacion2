package ejemplos.polimorfismo

object FigurasTest extends App {
  val circulo = new Circulo()
  val rectangulo = new Rectangulo()
  val lienzo = new Lienzo()

  rectangulo.cambiarColor("rojo")

  println(lienzo.mostrarFiguras(Array(circulo, rectangulo)))
}
