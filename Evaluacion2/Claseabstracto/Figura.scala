abstract class Figura {
    protected var color: String = "negro"

  /*  // un clase abstracta contine uno o mas metodos que no tienen implemetacion
    // una clase es abstracta por que no se puede crear objetos apartir de ellas

    def cambiarColor(color: String) = {
        this.color = color
      }*/

    def area():Float
    def dibujar(): String
}
