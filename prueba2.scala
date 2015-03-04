object prueba {
  def main (args: Array[String]){
    println("Primer polinomio: da las dos constantes:")
    val x1=readInt()
    val x2=readInt()
    println("Segundo polinomio: da las dos constantes:")
    val y1=readInt()
    val y2=readInt()
    println("  "+x1+"x+"+x2)
    println("+ "+y1+"x+"+y2)
    println("------")
    val z1=x1+y1
    val z2=x2+y2
    println(" "+z1+"x+"+z2)
  }
}
