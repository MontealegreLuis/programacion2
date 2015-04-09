object FigurasTest {
    def main(args: Array[String]) {


     println("tecle una de las opcion del menu");
     println("1. Calcular Area del rectangulo")
     println("2. Calcular Area del circulo")
     val n = readInt()

    n match {

      case 1 =>
      println("ingrese el tamaño de la base")
      val ba=readFloat()
      println("ingrese el tamaño de la altura")
      val al =readFloat()
      val rectangulo = new Rectangulo(ba,al)

      case 2 =>

      println("ingrese el radio del circulo")
      val r = readFloat()
      val circulo = new Circulo(r)


   }

    }
}
