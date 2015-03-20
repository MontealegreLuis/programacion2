class Circulo extends Figura {
    private val pi : Double = 3.14
    private var resultado : Double = 0
    def area(radio: Double): Double = {
       var r= radio
        resultado = (r * r) * pi
    }
}
