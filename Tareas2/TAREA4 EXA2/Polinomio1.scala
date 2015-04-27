class Polinomio(g: Int) {
    private val terminos = new Array[Termino](g + 1)
    private val grado = g

    def agregarTermino(c: Float, e: Int) = {
        terminos(e) = terminoDeGrado(e).reducir(new Termino(c, e))
    }

    private def agregarTermino(t: Termino) = {
        terminos(t.grado()) = terminoDeGrado(t.grado()).reducir(t)
    }

    private def terminoDeGrado(n: Int): Termino = {
        if (terminos(n) == null) {
            terminos(n) = new Termino(0, n)
        }
        terminos(n)
    }

    def evaluar(x: Float): Float = {
        var resultado: Float = 0

        for (i <- 0 to grado) {
            resultado = resultado + terminoDeGrado(i).evaluar(x)
        }

        resultado
    }

    def mostrar(): String = {
        var polinomio = ""

        for (i <- 0 to grado) {
            val termino = terminoDeGrado(i).mostrar()

            if (termino != "") {
                polinomio = polinomio.concat(termino + " + ")
            }
        }

        return polinomio.stripSuffix(" + ")
    }




    def sumar(b: Polinomio): Polinomio = {
        var g: Int = 0
        var menor = new Polinomio(0)
        var mayor = new Polinomio(0)

        if (this.grado >= b.grado) {      // hace referencia y clazifica que polinomio tiene mayor grado
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
            resultado.agregarTermino(menor.terminoDeGrado(i).reducir(mayor.terminoDeGrado(i)))
        }

        for (i <- menor.grado + 1 to mayor.grado) {
            resultado.agregarTermino(mayor.terminoDeGrado(i))
        }

        resultado

    }


    def restar(c: Polinomio): Polinomio = { // definimos un metodo restar

      var g: Int = 0
      var menor =  new Polinomio(0)
      var mayor =  new Polinomio(0)


      if (this.grado >= c.grado) {      // hace referencia y clazifica que polinomio tiene mayor grado
          g = this.grado
          menor = c
          mayor = this
      } else {
          g = c.grado
          menor = this
          mayor = c
      }

      val resultado1 = new Polinomio(g)

      for (i <- 0 to menor.grado) {
          resultado1.agregarTermino(menor.terminoDeGrado(i).aumentar(mayor.terminoDeGrado(i)))
      }

      for (i <- menor.grado + 1 to mayor.grado) {
          resultado1.agregarTermino(mayor.terminoDeGrado(i))
      }

      resultado1


    }
}
