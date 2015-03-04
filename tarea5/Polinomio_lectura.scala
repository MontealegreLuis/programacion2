
object Polinomio_lectura
{
  def main(args: Array[String])
  {
    var c = new Array[Int](2)
    var e = new Array[Int](2)
    var c1 = new Array[Int](2)
    var e1 = new Array[Int](2)

    var suma = 0;
    var suma1 = 0;
    var i=0;

    println("deme el primer polinomio ")

    for (i <- 0 to 2)
    {
      println("deme el coeficiente:"+i)
      c(i) = readInt()
    }


  //  println(""+c(0))

  }
}
