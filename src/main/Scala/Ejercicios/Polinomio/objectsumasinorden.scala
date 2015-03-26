package Ejercicios.Polinomio

object SumaPolinomiosSinOrden {
	def main(args: Array[String]) {
		println("Dame el grado del primer polinomio")
		val n = readInt()
		println("Dame el grado del segundo polinomio")
		val m = readInt()
		val p1 = new Polinomio(n)
		val p2 = new Polinomio(m)
		var coeficiente: Float = 0
		var exponente: Int = 0
		var continuar = true

		println("Dame los datos del primer polinomio")
		while (continuar) {
			println("Dame un coeficiente ")
			coeficiente = readFloat()
			println("Dame un exponente ")
			exponente = readInt()
			p1.agregarTermino(coeficiente, exponente)
			println("¿Quieres agregar otro término? (s/n)")
			var sino = readChar()
			if (sino == 's') {
				continuar = true
			} else {
				continuar = false
			}
		}

		continuar = true
		println("Dame los datos del segundo polinomio")
		while (continuar) {
			println("Dame un coeficiente ")
			coeficiente = readFloat()
			println("Dame un exponente ")
			exponente = readInt()
			p2.agregarTermino(coeficiente, exponente)
			println("¿Quieres agregar otro término? (s/n)")
			var sino = readChar()
			if (sino == 's') {
				continuar = true
			} else {
				continuar = false
			}
		}
		val resultado = p1.sumar(p2)
		println(p1.mostrar())
		println("+")
		println(p2.mostrar())
		println("El resultado es: " + resultado.mostrar())
}
}
