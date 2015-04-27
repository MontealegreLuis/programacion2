
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
    println("la suma de fracciones es = ")
    println(resultado.mostrar())



    val resultado1 = f1.resta(f2)

    println(n+"/"+d+"-"+n2+"/"+d2+"=")

    println("la resta de fracciones es = ")
    println(resultado1.mostrar())

    val resultado2 = f1.mult(f2)

    println(n+"/"+d+"*"+n2+"/"+d2+"=")

    println("la multiplicacion de fracciones es = ")
    println(resultado2.mostrar())


    val resultado3 = f1.div(f2)

    println(n+"/"+d+"/"+n2+"/"+d2+"=")

    println("la division de fracciones es = ")
    println(resultado3.mostrar())



  }


}
