object PolinomioTest{
  def main(args: Array[String]){
    var Polinomio = new Polinomio()
    Polinomio.agregaTermino(new Termino(4,2))
    esVerdadero(Polinomio.evalua(2) == 16,"4x^2 debe ser = 16 con x = 2")
  }
  def esVerdadero(resultado:Boolean, mensaje:String){
    if(!resultado){
      println(mensaje)
    }
  }
}
