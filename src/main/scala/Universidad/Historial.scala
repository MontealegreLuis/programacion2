class Historial()
{
    private val notas = new Array[Nota](1000)
    private val tope = 1000;
    private var index = 0;

    def agregarNota(nota:Nota) = {
      notas(index) = nota
      index = index + 1
    }

    def getNotaNoCalificada(): Array[Nota] = {
      val tmp = new Array[Nota](1000)
      var index = 0;
      for ( x <- notas) {
        if ( x.tieneCalificacion() ) {
          tmp(index) = x;
          index = index + 1
        }
      }
      return tmp;
    }

    def getNotaCalificada(): Array[Nota] = {
      val tmp = new Array[Nota](1000)
      var index = 0;
      for ( x <- notas) {
        if ( x.tieneCalificacion() == false ) {
          tmp(index) = x;
          index = index + 1
        }
      }
      return tmp;
    }

    def setCalificacion(nota: Nota, calif: Float)  {
      for ( i <- 0 to index)
      {
        if(notas(i).equals(nota))
        {
          notas(i).calificar(calif);
          return
        }
      }
    }

}
