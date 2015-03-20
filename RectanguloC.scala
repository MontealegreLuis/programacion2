class Rectangulo(base: Double, altura: Double) extends Figura {
    private var b = base
    private var a = altura
    def area(): Double = {
      b*a
    }
}
