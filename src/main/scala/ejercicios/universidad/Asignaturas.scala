package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Asignaturas{
	val asignaturas = new Array[Asignatura](20)
	var cont = 0
	var con = 0
	def agregar(asignatura: Asignatura){
		asignaturas(cont) = asignatura
		cont = cont+1
	}
	def deLaCarrera(carrera: String):Array[Asignatura] = {
  	val asig = new Array[Asignatura](20)
  	var con = 0
  	for(i <- 0 to asignaturas.length){
  		if(asignaturas(i).carrera == carrera){
  			asig(i)=asignaturas(i)
  			con = con+1
  		}
  	}
  	return asig
  }
  def totalCon():Int = {
		return con
	}
}