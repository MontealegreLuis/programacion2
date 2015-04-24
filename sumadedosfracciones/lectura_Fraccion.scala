
object Lectura {

  def main(args: Array[String])
  {

    println("deme la primera fraccion")
    println("deme el numerador")
    val n = readInt()

    println("deme el denominador")

    val d = readInt()


    val f1 = new Fraccion(n,d)

    println("deme la segunda fraccion")
    println("deme el numerador")
    val n2 = readInt()

    println("deme el denominador")

    val d2 = readInt()

    val f2 =  new Fraccion(n2,d2)


    val resultado = f1.suma(f2)

    println(n+"/"+d+"+"+n2+"/"+d2+"=")
    println(resultado.mostrar())
  }


}
