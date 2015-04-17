object Polinomio {
    def main(args: Array[String]){
        println("Ingrese coeficientes del primer polinomio:")
		val a = readInt() 
		val b = readInt()
		println("Su polinomio es:")
        println(s"$a x + $b")
        println("\n\nIngrese coeficientes del segundo polinomio:")
		val a2 = readInt() 
		val b2 = readInt() 
		println("Su polinomio es:")
        println(s"$a2 x + $b2")
        val sumaa = a + a2
        val sumab = b + b2
		println(s"La suma de ambos polinomios es: $sumaa x + $sumab");
    }
}