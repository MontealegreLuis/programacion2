object Polinomio {
    def main(args: Array[String]){
        println("Ingrese coeficientes del primer polinomio:")
		val x = readInt() 
		val t = readInt()
		println("Su polinomio es:")
        println(s"$x x + $t")
        println("\n\nIngrese coeficientes del segundo polinomio:")
		val x1 = readInt() 
		val t1 = readInt() 
		println("Su polinomio es:")
        println(s"$x x + $t1")
        val sumax = x + x1
        val sumat = t + t1
		println(s"La suma de ambos polinomios es: $sumax x + $sumat");
    }
}
