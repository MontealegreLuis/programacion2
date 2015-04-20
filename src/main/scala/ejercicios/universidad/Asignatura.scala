package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Asignatura(val nombre:String,val codigo:String,val descripcion:String,val departamento:Departamento){
	val carrera:String
	def nombre():String={
		this.nombre
	}
}
