object Lectura_de_Fracciones {

  def main(args: Array[String]) {

    println("deme cuantas fracciones va a sumar")

    val t =  readInt()

    val f1 = new Fraccion(t)
    lecturafracciones(f1)

    println(f1.mostrar())


    def lecturafracciones(f: Fraccion )
  {


    var continuar = 's'
    var denominador: Int = 0
    var numerador: Int = 0

    while(continuar == 's')
       {
            println("deme el denominador")
            denominador = readInt()
            println("deme el numerador")
            numerador =  readInt()

            f.agregarFraccion(denominador , numerador)

            println("quieres agregar otra fraccion? (s/n)")
            continuar = readChar()

         }
    }
  }

}
