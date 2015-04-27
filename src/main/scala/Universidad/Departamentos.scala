class Departamentos(){
  private val departamentos =  new Array[Departamento](100)
      private val tope = 100
      private var index = 0

      def agregar(departamento: Departamento)
      {
           if (index < (tope-1))
           {
             departamentos(index) = departamento
             index = index + 1
           }
      }

      def deLaCarrera(carrera: String) :  Array[Departamento] = {

        //:::::::::::::::::::
        var cont = 0;
        for ( i <- 0 to index-1 )
        {
          if ( departamentos(i).carrer() == carrera )
          {
            cont = cont + 1
          }
        }
        val tmp = new Array[Departamento](cont)
        //::::::::::::::::::::::
        var indexaux = 0
        for ( i <- 0 to index-1 )
        {
          if ( departamentos(i).carrer() == carrera )
          {
            tmp(indexaux) = departamentos(i)
            indexaux = indexaux + 1
          }
        }
        return tmp
      }



}
