class Proyectos(){
   private val proyecto = new Array[Proyecto](1000)
   private var index = 0;

   def agregar(proyec: Proyecto) = {
     proyecto(index) = proyec;
     index = index + 1
   }

   def conCodigo(codigo: String ): Proyecto = {
     for ( i <- 0 to index)
     {
       if ( proyecto(i).codigo() == codigo )
        return proyecto(i)
     }
     return null;
   }




}
