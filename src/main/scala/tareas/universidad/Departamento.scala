package tareas.universidad
import com.github.nscala_time.time.Imports._
class Departamento(val nombre:String,
                 val telefono:String,
                 val director:Professor,
                 val carrera:String){
                 extends Departamento(nombre,telefono,director){
                                def carrera():String
                }
}