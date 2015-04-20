package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Asignaturas{
	val asignatura = new Array[Asignatura](20)
	var cont = 0
	var con = 0
	def agregar(asignatura: Asignatura) = {
		asignatura(cont) = asignatura
		cont ++
	}
	def deLaCarrera(carrera: String):Array[Asignatura] = {
  	val asignaturas = new Departamentos()
  	var con = 0
  	for(i <- 0 to asignatura.length){
  		if(asignatura(i).carrera == carrera){
  			deptos(i)=departamentos(i)
  			con ++
  		}
  	}
  	return asignaturas
  }
  def totalCon():Int = {
		return con
	}
}