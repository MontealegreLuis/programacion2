object FigurasTest {
def main(args: Array[String]){
val Circulo = new Circulo()
println(circulo.dibujar())
val rectangulo = new rectangulo ()
rectangulo.cambiar color("Rojo")

val lienzo = new lienzo()
println(lienzo.mostrarFiguras(Array(circulo, rectangulo)))
}
}
