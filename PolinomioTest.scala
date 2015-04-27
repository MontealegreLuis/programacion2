object PolinomioMain {
  def main(args: Array[String]){
      var m: Int = 0
      var n: Int = 0
      var c: Float=0
      println("Ingresa el grado del primer polinomio")
      m=readInt()
      var p1 = new Polinomio(m + 1)
      println("Ingresa el grado del segundo polinomio")
      n=readInt()
      var p2 = new Polinomio(n + 1)
      for(i<-0 to m){
        println("Ingresa el termino coeficiente para x^",i)
        c=readFloat()
        p1.agregarTermino(c, i)
      }
      println("Polinomio 2")
    for(i<-0 to n){
      println("Ingresa el termino coeficiente para x^", i)
      c=readFloat()
      p2.agregarTermino(c, i)
    }
    if(m>=n){
      var pol = new Polinomio(m)
      pol=p1.sumar(p2)
    }
    else{
      var pol = new Polinomio(n)
      pol=p1.sumar(p2)
    }
  }
}
