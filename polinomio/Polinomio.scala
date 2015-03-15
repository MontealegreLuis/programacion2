class Polinomio
{
    private val terminos = new Array [Termino](2)

    var actual = 0

    def agregar(t: Termnio) =
      {
        terminos(actual) = t
        actual = actual + 1
      }

       def evaluar(x : Float ): Float =
       {
          var resultado: Float = 0

          for (termino <- terminos)

            {
              if (termino != null)
              {
                resultado =resultado + termino.evaluar(x)
              }
            }
          resultado
       }
}
