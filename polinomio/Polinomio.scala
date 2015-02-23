class Polinomio{
  private val terminos = new Array[Termino](2)
  var actual = 0
  def agrega(t:Termino)={
    for(i <- 0 to 2){
      if(t.exponente == i+1){
        if(terminos(i) != null){
          t.reducir(terminos(i))
        }
      }
    }

  }

  def evalua(x:Float):Float = {
    var res:Float = 0
    for(termino <- terminos){
      if(termino != null){
        res = res + termino.evalua(x)
      }
    }
    resultado
  }
}
