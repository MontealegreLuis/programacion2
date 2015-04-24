package tareas.universidad
import com.github.nscala_time.time.Imports._
class Projecto(val carrera:String,
             val nombre:String,
              val codigo.String,
              val fechaInicio: DateTime
              val subvencion:Float,
              val institucion:String,
              val investigador:Professor,
              val profesores:Profesores,
              val becarios:Alumnos)
              extends Proyecto(nombre,codigo,fechaInicio,subvencion,institucion){
              
    def addProfesor(profesor:Profesor){
    }
    def addbecario(alumno:Alumno){
    }
    def codigo():String={
    }
    def carrera():String={
    }
}