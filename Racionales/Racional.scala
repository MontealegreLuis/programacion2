class Racional(m: Int) {
    private val arreglo  = new Array[Parcial](m+1)
    private val total = m
    def agregarRacional(d: Int, n: Int)
    {
      arreglo(this.total) = racionalTotal(this.total).reducir(new Parcial(d , n))
    }
    private def agregarRacional(p: Parcial) =
      {
        val Total = this.total
        arreglo(Total) =  racionalTotal(Total).reducir(p)
      }
      private def racionalTotal(en: Int): Parcial =
        {
          if (arreglo(en) == null) {
            arreglo(en) = new Parcial(0,en)
          }
          arreglo(en)
        }
        def mostrar(): String = {
          var racional = ""
           var i = 0
          for ( i <- 0 to this.total)
          {
            var fp = racionalTotal(i).mostrar()
          }
          println( fp)
        }
     }
