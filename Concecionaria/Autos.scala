class Autos(){



  private val autos =  new Array[Auto](1000)
      private val tope = 1000
      private var index = 0

      def agregar(auto: Auto)
      {
           if (index < (tope-1))
           {
             autos(index) = auto
             index = index + 1
           }
      }


   def deLaConcesionaria(modelo: Int) : Array[Auto] = {

     var cont = 0;
        for ( i <- 0 to index-1 )
        {
          if ( autos(i).mode() == modelo)
          {
            cont = cont + 1
          }
        }
        val tmp = new Array[Auto](cont)
        //::::::::::::::::::::::

        var indexaux = 0
      for ( i <- 0 to index-1 )
      {
        if (  autos(i).mode() == modelo )
        {
          tmp(indexaux) = autos(i)
          indexaux = indexaux + 1
        }
      }
      return tmp

}


def delPrecio(precio: Float) : Array[Auto] = {

  var cont = 0;
     for ( i <- 0 to index-1 )
     {
       if ( autos(i).pre() == precio)
       {
         cont = cont + 1
       }
     }
     val tmp = new Array[Auto](cont)
     //::::::::::::::::::::::

     var indexaux = 0
   for ( i <- 0 to index-1 )
   {
     if (  autos(i).pre() == precio )
     {
       tmp(indexaux) = autos(i)
       indexaux = indexaux + 1
     }
   }
   return tmp

}

}
