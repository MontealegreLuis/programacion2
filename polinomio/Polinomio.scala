class Polinomio{
  private val terminos = new Array[Termino](2)
  var actual = 0
  def agrega(t:Termino)={

    terminos(actual) = t
    actual++
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
