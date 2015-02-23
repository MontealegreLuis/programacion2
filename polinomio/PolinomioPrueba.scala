object PolinomioPrueba{

  def main(args: Array[String]){

    var polinomio = new Polinomio()
    polinomio.agrega(new Termino(2,3))
    esVerdadero(polinomio.evalua(2) == 16,"2x³ debe ser = 16 con x = 2")

    def esVerdadero(resultado:Boolean, mensaje:String){
      if(!resultado){
        println(mensaje)
      }
    }
  }

}
