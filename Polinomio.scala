class Polinomio(grado: Int){
  private val Terminos = new Array [Termino](grado)
    def agregaTermino(c: Float, e: Int)={
      val termino = new Termino(c,e)
      if(Terminos(e-1)!=null){
        Terminos(e-1)=Terminos(e-1).reducir(termino)
      }
      else{
        Terminos(e-1)=termino
      }
    }

  def eval(x:Float):Float = {
    var res:Float = 0
    var i=0
    for(termino <- Terminos){
      if(termino != null){
        res = res + termino.eval(x)
      }
    }
    res
  }
  def mostrar(): String={
    var polinomio=""
    for(i<-0 to grado-2){
      if(termino!=null){
        polinomio=polinomio+ termino.mostrar + "+"
      }
    }
    polinomio=polinomio+ termino.mostrar
  }
}
