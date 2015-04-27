object polinomio {
  def main(args: Array[String]) {
  
    println ("El programa sumara dos polinomios grado 1")
    println ("De la forma (Ax+b)+(Cx-d)")
    
    println ("Introduce primer polinomio")
    println ("Introduce coeficiente de la variable 'x' ")
    var coef1: Int = readInt 
    println ("Introduce coeficiente")
    var valor1: Int = readInt 
    println ("")
    println ("Introduce segundo polinomio")
    println ("Introduce coeficiente de la variable 'x'")
    var coef2: Int = readInt 
    println ("Introduce coeficiente")
    var valor2: Int = readInt 
    var sumax:Int = coef1+coef2
    var sumay:Int = valor1+valor2
    
  println("\nLa suma de  " + coef1 + "x +" + valor1 + "\n+\n " + coef2 + "x +" + valor2)     
  println("\nEs " + sumax + "x+" + sumay + "\n\n ")  
    
 }
}