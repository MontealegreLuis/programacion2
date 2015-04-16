object Polinomio{

    def main (args: Array[String]){
      var P1 = new Array[Int](50)
      var P2 = new Array[Int](50)
      var PM = new Array[Int](50)
      var menor = 0
      var mayor = 0
      var grado_1 = 0
      var grado_2 = 0
        
        println ("= Polinomio 1 =")
        println ("De que grado es?")
        grado_1 = readInt()
        println ("Ingresa los coeficientes:")
        for(i<-0 to grado_1){
            P1(i) = readInt()
        }

        println ("\n= Polinomio 2 =")
        println ("De que grado es?")
        grado_2 = readInt()
        println ("Ingresa los coeficientes:") 
        for(i<-0 to grado_2){
            P2(i) = readInt()
        }

        if (grado_1>=grado_2){
        PM=P1
        menor=grado_2
        mayor=grado_1

        }
        else {
        PM=P1
        menor=grado_1
        mayor=grado_2
        }
        for(i<-0 to menor){
            PM(i) = P1(i) + P2(i)
        }
        for(i<-menor + 1 to mayor){
        PM(i) = PM(i)
        }
    
    println("El resultado de la suma es:")
        for(i<-0 to mayor) {
            println(+ PM(i) + "x^" + i)
        }

    }


}