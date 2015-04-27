object FigurasTest {
    def main(args: Array[String]) {


     println("que opcion desea");
     println("1. Calcular Area del rectangulo")
     println("2. Calcular Area del circulo")
     val n = readInt()

    n match {

      case 1 =>
      println("deme el tamaño de la base")
      val b=readDouble()
      println("deme el tamaño de la altura")
      val al =readDouble()
      val rectangulo = new Rectangulo(al,b)
      println("el area del rectangulo es:")
      println(rectangulo.area())

      case 2 =>

      println("deme el radio del circulo")
      val r = readDouble()
      val circulo = new Circulo(r)
      println("el area del circulo es: ")
      println(circulo.area())

  }



    }
}
