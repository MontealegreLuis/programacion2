class Secciones()
{

  private val secciones =  new Array[Seccion](1000)
      private val tope = 1000
      private var index = 0

      def agregar(seccion: Seccion)
      {
           if (index < (tope-1))
           {
             secciones(index) = seccion
             index = index + 1
           }
      }

      def queCoincidanCon(carrera: String, cuatrimestre: String, anio: Int) :  Array[Seccion] = {
        val tmp = new Array[Seccion](1000)
        val indexaux = 0
        for ( i <- 0 to index )
        {
          if ( secciones(i).carrera() == carrera && secciones(i).cuatrimestre() == cuatrimestre
          && secciones(i).anio() == anio)
          {
            tmp(indexaux) = secciones(i)
            index = index + 1
          }
        }
        return tmp
      }

}
