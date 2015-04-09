object SumaPolinomios {
    def main(args: Array[String]) {
        println("ingresa el grado del primer polinomio")
        val n = readInt()
        val p1 = new Polinomio(n)
        println("ingresa los datos del primer polinomio")
        capturarCoeficientes(p1, n)

        println("ingresa el grado del segundo polinomio")
        val m = readInt()
        val p2 = new Polinomio(m)
        println("ingresa los datos del segundo polinomio")
        capturarCoeficientes(p2, m)

        val resultado = p1.sumar(p2)

        println(p1.mostrar())
        println("+")
        println(p2.mostrar())
        println("El resultado de la suma de polinomio es: " + resultado.mostrar())

        val resultado1 = p2.restar(p1)
        println(p1.mostrar())
        println("-")
        println(p2.mostrar())
        println("El resultado de resta de polinomio es : " + resultado1.mostrar())

    }

    def capturarCoeficientes(p: Polinomio, grado: Int) {
        var coeficiente: Float = 0;

        for (i <- 0 to grado) {
            println("ingrese el coeficiente de grado " + i)
            coeficiente = readFloat()
            p.agregarTermino(coeficiente, i)
        }
    }
}
