class Asignaturas(){

  private val asignaturas =  new Array[Asignatura](100)
      private val tope = 100
      private var index = 0

      def agregar(asignatura: Asignatura)
      {
           if (index < (tope-1))
           {
             asignaturas(index) = asignatura
             index = index + 1
           }
      }

      def deLaCarrera(carrera: String) :  Array[Asignatura] = {
        val tmp = new Array[Asignatura](100)
        var indexaux = 0
        for ( i <- 0 to index )
        {
          if ( asignaturas(i).carrera() == carrera )
          {
            tmp(indexaux) = asignaturas(i)
            index = index + 1
          }
        }
        return tmp
      }
}
