object FigurasTest {
    def main(args: Array[String]) {
        val circulo = new Circulo()
        val rectangulo = new Rectangulo()

        rectangulo.cambiarColor("rojo")

        val lienzo = new Lienzo()
        println(lienzo.mostrarFiguras(
            Array(circulo, rectangulo)
        ))
    }
}
