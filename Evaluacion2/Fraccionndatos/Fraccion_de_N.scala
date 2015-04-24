class Fraccion(t: Int) {

    private val arreglo  = new Array[Parcial](t+1)
    private val total = t

    def agregarFraccion(d: Int, n: Int)
    {
      arreglo(this.total) = fraccionTotal(this.total).reducir(new Parcial(d , n))

    }

    private def agregarFraccion(p: Parcial) =
      {
        val Total = this.total
        arreglo(Total) =  fraccionTotal(Total).reducir(p)
      }

      private def fraccionTotal(en: Int): Parcial =
        {
          if (arreglo(en) == null) {
            arreglo(en) = new Parcial(0,en)

          }
          arreglo(en)
        }


        def mostrar(): String = {

          var fraccion = ""

           var i = 0
           
          for ( i <- 0 to this.total)
          {
            var fp = fraccionTotal(i).mostrar()

          }

          println( fp)
        }

  }
