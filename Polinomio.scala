class Polinomio(g: Int) {
    private val terminos = new Array[Termino](g + 1)
    private val grado = g

    def agregarTermino(c: Float, e: Int) = {
        val termino = new Termino(c, e)

        if (terminos(e) != null) {
            terminos(e) = terminos(e).reducir(termino)
        } else {
            terminos(e) = termino
        }
    }

    private def agregarTermino(t: Termino) = {
        if (terminos(t.grado()) != null) {
            terminos(t.grado()) = terminos(t.grado()).reducir(t)
        } else {
            terminos(t.grado()) = t
        }
    }

    def evaluar(x: Float): Float = {
        var resultado: Float = 0

        for (termino <- terminos) {
            if (termino != null) {
                resultado = resultado + termino.evaluar(x)
            }
        }

        resultado
    }

    def mostrar(): String = {
        var polinomio = ""

        for (i <- 0 to grado - 1) {
            if (terminos(i) != null) {
                polinomio = polinomio + terminos(i).mostrar() + " + "
            }
        }

        polinomio + terminos(grado).mostrar()
    }

    def sumar(b: Polinomio): Polinomio = {
        var g: Int = 0
        var menor = new Polinomio(0)
        var mayor = new Polinomio(0)

        if (this.grado >= b.grado) {
            g = this.grado
            menor = b
            mayor = this
        } else {
            g = b.grado
            menor = this
            mayor = b
        }

        val resultado = new Polinomio(g)
        for (i <- 0 to menor.grado) {
            if (menor.terminos(i) != null && mayor.terminos(i) == null) {
                resultado.agregarTermino(menor.terminos(i))
            } else if (menor.terminos(i) == null && mayor.terminos(i) != null) {
                resultado.agregarTermino(mayor.terminos(i))
            } else if (menor.terminos(i) != null && mayor.terminos(i) != null) {
                resultado.agregarTermino(menor.terminos(i).reducir(mayor.terminos(i)))
            }
        }

        for (i <- menor.grado to mayor.grado) {
            if (mayor.terminos(i) != null) {
                resultado.agregarTermino(mayor.terminos(i))
            }
        }

        resultado
    }
}
