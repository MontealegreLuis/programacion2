object FigurasTest {
    def main(args: Array[String]) {
        var x : Double = 0
        var y : Double = 0
        var z : Double = 0
        println("Que quieres calcular ")
        println("1. Rectangulo ")
        println("2. Circulo ")
        val opcion = readInt()
        if(opcion==1){
          println("Ingresa la base ")
          x = readDouble()
          println("Ingresa la altura ")
          y = readDouble()
          val rectangulo = new Rectangulo()
          println(rectangulo.area(x, y))
        }
        if(opcion==2){
          println("Ingresa el radio del circulo")
          z = readDouble()
          val circulo = new Circulo()
          println(circulo.area(z))
        }
    }
}
