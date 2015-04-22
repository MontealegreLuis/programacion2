class Alumnos()
{
    private val alumnos =  new Array[Alumno](10)
    private val tope = 10
    private var index = 0

    def agregar(alumno: Alumno)
    {
         if (index < (tope-1))
         {
           alumnos(index) = alumno
           index = index + 1
         }
    }

    def deLaCarrera(carrera: String) :  Array[Alumno] = {
      
      var tmp = new Array[Alumno](10)
      var indexaux = 0
      for ( i <- 0 to index )
      {
        if ( alumnos(i).carrera() == carrera )
        {
          tmp(indexaux) = alumnos(i)
          index = index + 1
        }
      }
      return tmp
    }

    def conMatricula(matricula: String) : Alumno = {
      for ( i <- 0 to index )
      {
        if(alumnos(i).matricula() == matricula)
          return alumnos(i)
      }
      return null
    }

    def calificar(alumno: Alumno, nota: Nota, calif: Float) = {
      var indexaux = 0
      for ( i <- 0 to index )
      {
        if ( alumnos(i).equals(alumno) )
        {
          alumnos(i).calificar(nota, calif)
        }
      }
    }

    def getAll(): Array[Alumno] = {
      return alumnos;
    }

}
