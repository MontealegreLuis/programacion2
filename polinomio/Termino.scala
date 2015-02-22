class Termino(c: Float, e: Int){

  val coeficiente=c;
  val exponente=e;

  def evaluar(x: Float): Float = {

    var resultado : Float = 1

    for(i <- 1 to exponente){

      resultado = resultado * x

    }

    c*resultado

  }

  def tieneMismoGrado(t:Termino) : Boolean =
    {
      this.exponente == t.exponente
    }

}
