object Polinomio{

    def main (args: Array[String]){
      var p1 = new Array[Int](8)
      var p2 = new Array[Int](8)
      var pm = new Array[Int](8)
      var menor = 0
      var mayor = 0
      var g1 = 0
      var g2 = 0

      println ("Dame el grado del primer polinomio\n")
         g1 = readInt()
      println ("Dame los coeficientes del polinomio\n")
      for (i<-0 to g1){
            p1(i) = readInt()
         }

      println("Dame el grado del segundo polinomio\n")
       g2 = readInt()

      println("Dame los coeficientes del polinomio\n")
      for(i<-0 to g2){
       p2(i) = readInt()
     }

      if (g1>=g2){
        pm=p1
        menor=g2
        mayor=g1

        }
      else {
        pm=p2
        menor=g1
        mayor=g2
      }
    for(i<-0 to menor){
      pm(i) = p1(i) + p2(i)
    }
    for(i<-menor + 1 to mayor){
      pm(i) = pm(i)
    }
    println("La suma de los polinomios:")
    for(i<-0 to mayor) {
      println(+ pm(i) + "x^" + i)
    }

    }


}
