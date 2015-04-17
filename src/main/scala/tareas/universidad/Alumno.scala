package tareas.universidad
import com.github.nscala_time.time.Imports._
class Alumno (val matricula:String,
              val historial:Historialacademico)
    extends Persona(nombre,numeroSeguroSocial,direccion,sexo,fechaNacimiento){
    def matricula():String
    }
