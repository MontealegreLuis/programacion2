package tareas.universidad
import com.github.nscala_time.time.Imports._
class Persona(val nombre:String,
              val numeroSeguroSocial:Int,
              val direccion:String,
              val sexo:String,
              val fechaNacimiento:DateTime,
              val carrera:String)
    extends Persona(nombre,numeroSeguroSocial,direccion,sexo,fechaNacimiento,carrera){
    def carrera():String{
    }
}