object PolinomioMain{
  def main(args:Array [String]){
    var mayor = 0
    var menor=0
    var pmayor = new Array[Int](0)

    println("Ingrese el grado del primer Polinomio")
    var n= readInt()
    var p1 = new Array[Int](n + 1)
    leer(p1)
    println("Ingrese el grado del segundo Polinomio")
    var m=readInt()
    var p2 = new Array[Int](m + 1)
    leer(p2)
    if(n>=m){
      menor=m
      Pmayor=p1
    }
    else{
      menor=n
      Pmayor=p2
    }
    for(i <- 0 to menor){
      Pmayor(i)=p1(i) + p2 (i)
    }
  }

  def leer (p: Array[Int])={

    for(i <- 0 to p.length - 1){
      println("Ingresa el coeficiente de grado")
      p(i)=readInt()
    }
  }
}
