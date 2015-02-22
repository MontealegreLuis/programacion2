object  PolinomioTest
{
     def main(args: Array[String])
     {
        var polinomio = Polinomi()

        polinomio.agregar(new Termino(2,3))

        esVerdadero(polinomio.evaluar(2)==16, "2x^3 deberia ser 16 si x=2")

        polinomio.agregar(new Termino(5,1))

        esVerdadero(polinomio.evaluar(2) == 26, "5x + 2x^3 deberia ser 26 si x=2")
     }


       def esVerdadero(resultado: Boolean, mensaje: String)
       {
         if (!resultado)
          {
            println(mensaje)
          }
       }
}
