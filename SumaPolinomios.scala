object SumaPolinomios {
    def main(args: Array[String]) {
        println("Dame el grado del primer polinomio")
        val n = readInt()
        println("Dame el grado del segundo polinomio")
        val m = readInt()
        val p1 = new Polinomio(n)
        val p2 = new Polinomio(m)
        var coeficiente: Float = 0;

        println("Dame los datos del primer polinomio")
        for (i <- 0 to n) {
            println("Dame el coeficiente de grado " + i)
            coeficiente = readFloat()
            p1.agregarTermino(coeficiente, i)
        }

        println("Dame los datos del segundo polinomio")
        for (i <- 0 to m) {
            println("Dame el coeficiente de grado " + i)
            coeficiente = readFloat()
            p2.agregarTermino(coeficiente, i)
        }

        val resultado = p1.sumar(p2)

        println(p1.mostrar())
        println("+")
        println(p2.mostrar())
        println("El resultado es: " + resultado.mostrar())
    }
}
