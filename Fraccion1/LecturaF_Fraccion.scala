
object LecturaF {

  def main(args: Array[String])
  {

    println("ingrese la primera fraccion")
    println("ingrese el numerador de la fraccion")
    val n = readInt()

    println("ingrese el denominador de la fraccion ")

    val d = readInt()


    val f0 = new Fraccion(n,d)

    println("ingrese la segunda fraccion")
    println("ingrese el numerador de la fraccion")
    val n1 = readInt()

    println("ingrese el denominador de la fraccion ")

    val d1 = readInt()

    val f1 =  new Fraccion(n1,d1)


    val resultado = f0.suma(f1)

    println(n+"/"+d+"+"+n1+"/"+d1+"=")
    println(resultado.mostrar())
  }


}
