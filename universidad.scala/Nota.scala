class Nota(sec: Seccion)
{
   private val seccion = sec;
   private var calificacion = -1.0;

   def calificar(cali: Float) = {
     calificacion = cali
   }

   def tieneCalificacion(): Boolean ={
     if ( calificacion == -1.0)
      return false
     return true
   }

}
