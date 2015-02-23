object TerminoPrueba {
  def main(args:Array[String]){
    var termino = new Termino(11,2)
    esVerdadero(termino.evalua(2))== 44,"11x² deberia ser 44 con x=2"
    var termino2 = new Termino(12,3)
    esVerdadero(termino.tieneMismoGrado(termino2),"11x² debe tener el mismo grado que 12x³")
    var termino3 = new Termino(5,3)
    esVerdadero(termino2.tieneMismoGrado(termino3),"11x² debe tener el mismo grado que 5x³")
  }
  def esVerdadero(resultado:Boolean, mensaje:String){
    if(!resultado){
      println(mensaje)
    }
  }

}
