
object Polinomio_lectura
{
  def main(args: Array[String])
  {
    var c = new Array[Int](3)
    var e = new Array[Int](3)
    var c1 = new Array[Int](3)
    var e1 = new Array[Int](3)

    var suma = 0;
    var suma1 = 0;
    var i=0;

    println("deme el primer polinomio ")

    for (i <- 0 to 2)
    {
      println("deme el coeficiente:"+i)
      c(i) = readInt()
      println("deme el exponente:"+i)
      e(i)=readInt()
    }


    println("deme el segundo polinomio")

    for(j <- 0 to 2)
  {

    println("deme el coeficiente:"+j)
    c1(j) = readInt()
    println("deme el exponente:"+j)
    e1(j)=readInt()


  }


  if (e(0)==e1(0))
  {
    suma= c1(0) + c(0)

    println(suma)


  }

  if (e(1) == e1(1))
  {
    suma1 = c1(1) + c(1)
    println(suma1)
  }

  println(""+suma+"x^"+e(0)+"+"+suma1)

  }
}
