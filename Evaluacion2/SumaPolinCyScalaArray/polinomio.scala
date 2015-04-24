import scala.util.control._

object polinomioN{
  def main(args: Array[String]){
    var may = 0
    var men = 0
    val loop = new Breaks;
    println("Deme el numero de terminos del primer polinomio:")
      val n = readInt()
      var polin = new Array[Int](n)
      var grado = new Array[Int](n)

      for(i <- 0 to n-1) {
         println("Deme el coeficiente del termino " + i)
         polin(i) = readInt()
         println("Deme el grado del termino "+i)
         grado(i) = readInt()
       }

    println("Deme el numero de terminos del segundo polinomio:")
      val m = readInt()
      var polin2 = new Array[Int](m)
      var grado2 = new Array[Int](m)

     for(i <- 0 to m-1) {
        println("Deme el coeficiente del termino " + i)
        polin2(i) = readInt()
        println("Deme el grado del termino "+i)
        grado2(i) = readInt()
      }
     if(n > m){
       may = n
     }else{
       may = m
     }
     var result = new Array[Int](may)
     loop.breakable{
     for(i <- 0 to may-1){
       if(grado(i) == grado2(i)){
         result(i) = polin(i) + polin2(i)
       }else{
         loop.break;
       }
     }
   }
     for(i <- 0 to may-1){
       println(result(i))
     }
  }
}
