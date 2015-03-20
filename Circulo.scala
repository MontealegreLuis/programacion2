class Circulo(radio: Double) extends Figura {
    private var r = radio
    private val pi : Double = 3.14

    def area(): Double = {
        (r * r) * pi
    }
}
