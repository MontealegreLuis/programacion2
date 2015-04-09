class Termino(c: Float, e: Int) {
    private val coeficiente = c
    private val exponente = e

    def evaluar(x: Float) : Float = {

        var resultado: Float = 1
        for (i <- 1 to exponente) {
            resultado = resultado * x
        }

        coeficiente * resultado
    }

    def grado(): Int = {
        this.exponente
    }

    def tieneMismoGrado(t: Termino): Boolean = {
        this.exponente == t.exponente
    }

    def reducir(t: Termino): Termino = {
        if (tieneMismoGrado(t)) {
            return new Termino(
                this.coeficiente + t.coeficiente,
                this.exponente
            )
        }
        t
    }

    def esIgual(t: Termino) : Boolean = {
        this.coeficiente == t.coeficiente && this.exponente == t.exponente
    }

    def mostrar() : String = {
        coeficiente + "x^" + exponente
    }

    /*def multiplica(t:Termino):Termino ={
      var ex :Int =0
      var co :Float =0
      ex = this.exponente + t.exponente
      co = this.coeficiente * t.coeficiente
      return new Termino(co,ex)
    }*/
}
