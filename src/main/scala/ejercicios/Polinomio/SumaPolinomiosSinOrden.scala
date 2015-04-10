object SumaPolinomiosSinOrden{
  def main(args: Array[String]){
    println("\n Ingrese el grado del primer polinomio \n")
    val n = readInt()
    println("\n Ingrese el grado del segundo polinomio \n")
    val m = readInt()
    val p1 = new Polinomio(n)
    val p2 = new Polinomio(m)
    var exponente: Int = 0
    var continuar = true
    var coeficiente:Float = 0
    println("\n ingrese los valores del primer polinomio \n")
    while(continuar){
      println(" \n ingrese un coeficiente ")
      coeficiente = readFloat()
      println("dame un exponente \n")
      exponente = readInt()
      p1.agregarTermino(coeficiente,exponente)
      println("\n quieres agregar otro termino s..si   n..no \n")
      var sino = readChar()
      if(sino == 's'){
        continuar = true
      }else{
        continuar = false
      }
    }
    continuar = true
    println("\n ingrese los valores del segundo polinomio \n")
    while(continuar){
      println(" \n ingrese un coeficiente ")
      coeficiente = readFloat()
      println("dame un exponente \n")
      exponente = readInt()
      p2.agregarTermino(coeficiente,exponente)
      println("\n quieres agregar otro termino s..si   n..no \n")
      var sino = readChar()
      if(sino == 's'){
        continuar = true
      }else{
        continuar = false
      }
    }
  }
}                                                   // <console>:13: error: not found: type Polinomio
                                                    //            val p1 = new Polinomio(n)
