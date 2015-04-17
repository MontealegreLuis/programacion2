object Polinomio{

    def main (args: Array[String]){
      var a1 = new Array[Int](50)
      var a2 = new Array[Int](50)
      var aM = new Array[Int](50)
      var g1 = 0
      var g2 = 0
      var menor = 0
      var mayor = 0
      
        println ("***Polinomio 1 ")
        println ("ingresa el grado***")
        g1 = readInt()
        println ("***Ingresa los coeficientes:")
        for(i<-0 to g1){
            a1(i) = readInt()
        }

        println ("\n Polinomio 2***")
        println ("ingresa el grado")
        g2 = readInt()
        println ("Ingresa los coeficientes:") 
        for(i<-0 to g2){
            a2(i) = readInt()
        }

        if (g1>=g2){
        aM=a1
        menor=g2
        mayor=g1

        }
        else {
        aM=a1
        menor=g1
        mayor=g2
        }
        for(i<-0 to menor){
            aM(i) = a1(i) + a2(i)
        }
        for(i<-menor + 1 to mayor){
        aM(i) = aM(i)
        }
    
    println("***El resultado de la suma es:***")
        for(i<-0 to mayor) {
            println(+ aM(i) + "x^" + i)
        }

    }


}
