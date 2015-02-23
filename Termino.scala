class Termino(c:Float,e:Int){
  private val coeficiente=c
  private val exponente=e
  def eval(x:Float):Float={
    var res:Float = 1
    for(i <- 1 to exponente){
      res=res*x
    }
    return res=res*c
  }
  def tieneMismoGrado(t:Termino):Boolean = {
    this.exponente == t.exponente
  }
  def reducir(t: Termino): Termino={
    if(TieneMismoGrado(t)){
      return new Termino(
        this.coeficiente+t.coeficiente,
        this.exponente)
    }
  }
  def esIgual(t:Termino): Boolean={
    (this.coeficiente==t.coeficiente&&this.exponente==t.exponente)
}
  def mostrar():String={
    "Hola"
  }
}
