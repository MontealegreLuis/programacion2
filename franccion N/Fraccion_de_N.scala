class Fraccion(r: Int) {

    private val arreglo  = new Array[Parcial](r+1)
    private val resultado = r

    def agregarFraccion(d: Int, n: Int)
    {
      arreglo(this.resultado) = fraccionResultado(this.resultado).reducir(new Par(d , n))

    }

    private def agregarFraccion(p: Par) =
      {
        val Resultado = this.resultado
        arreglo(Resultado) =  fraccionResultado(Resultado).reducir(p)
      }

      private def fraccionResultado(res: Int): Par =
        {
          if (arreglo(res) == null) {
            arreglo(res) = new Par(0,res)

          }
          arreglo(res)
        }


        def mostrar(): String = {

          var fraccion = ""

           var j = 0

          for ( j <- 0 to this.resultado)
          {
            var fr = fraccionResultado(i).mostrar()

          }

          println( fr)
        }

  }
