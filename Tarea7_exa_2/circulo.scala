class Circulo(r : Double )

extends Figura {

val radio: Double = r


    def area() : Double =  {

       var pi: Double = 3.14
      val resultado = pi * (radio * radio)

      return resultado
    }
}
