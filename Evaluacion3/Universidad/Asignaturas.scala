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
        //::::::::::::::::::::
        var cont = 0;
        for ( i <- 0 to index-1 )
        {
          if ( asignaturas(i).carrera() == carrera )
          {
            cont = cont + 1
          }
        }
        val tmp = new Array[Asignatura](cont)
        //:::::::::::::::::::::::::::::::::::::::
        var indexaux = 0
        for ( i <- 0 to index-1 )
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
