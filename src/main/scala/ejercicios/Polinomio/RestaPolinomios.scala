object RestaPolinomios{
  def main(args: Array[String]){
    println("\n ingrese el grado del primer polinomio \n")
    val n = readInt()
    println("\n ingrese el grado del segundo polinomio \n")
    val m = readInt()
    val p1 = new Polinomio(n)
    val p2 = new Polinomio(m)
  }
}
