package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Departamentos{
  val departamentos = new Array[Departamento](6)
  var cont = 0
  var con = 0
  def agregar(departamento:Departamento){
    departamentos(cont)=departamento
    cont =cont+1
  }
  def deLaCarrera(carrera: String):Array[Departamento] = {
  	val deptos = new Array[Departamento](20)
  	for(i <- 0 to departamentos.length){
  		if(departamentos(i).carrera == carrera){
  			deptos(i)=departamentos(i)
  			con = con+1
  		}
  	}
  	return deptos
  }
  def totalCon():Int={
  	con
  }
  def total():Int = {
  	cont
  }
}
