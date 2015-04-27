import com.github.nscala_time.time.Imports._
class Proyecto(nombre: String, codigo: String, fechaInicio: DateTime,
  subvencion: Float, institucion: String, carrera: String, investigador: Profesor)
{
   private val carr = carrera;
   private val nomb = nombre;
   private val codi = codigo;
   private val fechaIni = fechaInicio
   private val subven = subvencion;
   private val instituto = institucion;
   private val investiga = investigador;
   private val profe = new Profesores()
   private val beca = new Alumnos()




   def agregarProfesor(profesor: Profesor) = {
     profe.agregar(profesor);
   }

   def agregarBecario(alumno :  Alumno) = {
     beca.agregar(alumno);
   }

   def codigo(): String = {
     return codi
   }

   def carrera(): String =
     {
       return carr
     }

   def nombre(): String = {
     return nomb
   }

   def fechaInicio(): DateTime = {
     return fechaIni;
   }

   def subvencion(): Float = {
     return subven;
   }

   def institucion(): String = {
     return instituto;
   }

   def investigador(): String = {
     return investiga.nombre();
   }

   def profesores(): Array[Profesor] = {
     return profe.getAll()
   }

   def becarios(): Array[Alumno] = {
     return beca.getAll()
   }
}
