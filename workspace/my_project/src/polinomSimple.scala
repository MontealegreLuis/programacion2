object polinomSimple {
  def main(args: Array[String]) {
  
    println ("El programa sumara dos polinomios grado 1")
    println ("Seran (2x+5)+(3x-2)")
    
   var x1:Int = 2
   var x2:Int =3
   var cof1:Int =5
   var cof2:Int = -2
    var sumx:Int = x1+x2
    var sumy:Int = cof1+cof2
    
  println ("suma de \n"+x1+"x+"+cof1+"\n+\n"+x2+"x+"+cof2)
    println ("es igual a "+sumx+"x+"+sumy)
    
}
}