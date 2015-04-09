object Lectura_Fracciones {

  def main(args: Array[String]) {

    println("ingrese las  fracciones que va a sumar")

    val r =  readInt()

    val f1 = new Fraccion(t)
    lecturafracciones(f1)

    println(f1.mostrar())


    def lecturafracciones(f: Fraccion )
  {


    var siguiente = 's'
    var den: Int = 0
    var num: Int = 0

    while(siguiente == 's')
       {
            println("ingrese el denominador de la fraccion ")
            den = readInt()
            println("ingrese el numerador de la fraccion ")
            num =  readInt()

            f.agregarFraccion(den , num)

            println("deseas ingresar otra fraccion? (s/n)")
            siguiente = readChar()

         }
    }
  }

}
