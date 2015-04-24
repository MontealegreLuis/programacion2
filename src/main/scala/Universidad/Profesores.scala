class Profesores()
{

  private val profesores =  new Array[Profesor](1000)
      private val tope = 1000
      private var index = 0

      def agregar(profesor: Profesor)
      {
           if (index < (tope-1))
           {
             profesores(index) = profesor
             index = index + 1
           }
      }

      def deLaCarrera(carrera: String) :  Array[Profesor] = {
        var cont = 0;
        for ( i <- 0 to index-1 )
        {
          if ( profesores(i).carrera() == carrera )
          {
            cont = cont + 1
          }
        }
        val tmp = new Array[Profesor](cont)
        var indexaux = 0
        for ( i <- 0 to index-1 )
        {
          if ( profesores(i).carrera() == carrera )
          {
            tmp(indexaux) = profesores(i)
            indexaux = indexaux + 1
          }
        }
        return tmp
      }

      def getAll(): Array[Profesor] = {
        return profesores;
      }
}
