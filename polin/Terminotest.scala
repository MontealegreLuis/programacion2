object Terminotest {

  def main(args: Array[String]){

    var termino = new Termino (10,2);

    var resultado = termino.evaluar(2);

    esVerdadero(resultado== 40, "10x^2 deberia ser 40 con x=2")

    /*if (resultado==20){
      println("funciona")
    }*/


    var termino2 = new Termino(3,2)

    esVerdadero(termino.tieneMismoGrado(termino2),"10x^2 deberia terner el mismo grado que 3x^2")

    /*if (termino.tieneMismoGrado (termino2))
    {
      println("funcioona")
    }*/




   var termino3 = new Termino(5,3)

    esVerdadero(!termino2.tieneMismoGrado(termino3),"3x^2 no deberia tener el mismo grado que 10x^2")

      /*if (!termino2.tieneMismoGrado(termino3) )
      {
        println("funciona!")
      }*/

  }
    def esVerdadero(resultado: Boolean, mensaje:String)
    {
       println(mensaje)
    }

}
