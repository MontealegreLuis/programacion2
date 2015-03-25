package ejemplos.polimorfismo

class Lienzo {
  def mostrarFiguras(figuras: Array[Figura]): String = {
    var f = ""
    for (figura <- figuras) {
      f = f + figura.dibujar() + "\n"
    }
    f
  }
}
