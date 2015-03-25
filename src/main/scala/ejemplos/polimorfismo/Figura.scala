package ejemplos.polimorfismo

abstract class Figura {
    protected var color: String = "negro"

    def cambiarColor(color: String) = this.color = color

    def dibujar(): String
}
