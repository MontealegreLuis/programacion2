object SumaPolinomios{
  def main(args: Array[String]){
    println("\n Ingrese el grado del primer polinomio \n")
    val n = readInt()
    println("\n Ingrese el grado del segundo polinomio \n")
    val m = readInt()
    val p1 = new Polinomio(n)
    val p2 = new Polinomio(m)
    var coeficiente:Float = 0
    println("\n ingrese los valores del primer polinomio \n")
    for(i<- 0 to n){
      println(" \n ingrese el coeficiente de grado " + i)
      coeficiente = readFloat()
      p1.agregarTermino(coeficiente,i)
    }
    println("\n ingrese los valores del segundo polinomio \n")
    for(i<- 0 to m){
      println("\n ingrese el coeficiente de grado " + i)
      coeficiente = readFloat()
      p2.agregarTermino(coeficiente,i)
    }
    val resultado = p1.sumar(p2)
    println(p1.mostrar())
    println("+")
    println(p2.mostrar())
    println("\n el resultado es :" + resultado.mostrar())
  }
}
