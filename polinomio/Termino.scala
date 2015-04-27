class Termino(c:Float,e:Int){
  private val ceoeficiente=c
  private val exponente=e
  def evalua(x:Float):Float{
    var res:Float = 1
    for(i <- 1 to exponente){
      res=res*x
    }
    c * res
  }
  def tieneMismoGrado(t:Termino):Boolean = {
    this exponente == t.exponente
  }

  def reducir(t:Termino):Termino ={
    if(tieneMismoGarado(t)){
      return new Termino(this.coeficiente + t.coeficiente, this.exponente)
    }
    t
  }

  def esIgual(t:Termino):Boolean ={
    this.coeficiente == t.coeficiente && this.exponente == t.exponente
  }
}
