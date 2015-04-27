object Polinomio {
 def main(args: Array[String]){
 println("Da coeficientes del 1er polinomio:")
 val a = readInt()
 val b = readInt()
 println(s"$a x + $b")

 println("\nDa coeficientes del 2do polinomio:")
 val y = readInt()
 val z = readInt()
 println(s"$y x + $z")

 val sumaa = a + y
 val sumab = b + z
 println(s"La suma de los polinomios es: $sumaa x + $sumab");
 }
}
