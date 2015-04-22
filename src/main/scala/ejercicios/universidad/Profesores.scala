package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Profesores{
  val profesores = new Array[Profesor](6)
  var cont = 0
  def agregar(profesor:Profesor){
    profesores(cont)=profesor
    cont = cont+1
  }
  def deLaCarrera(carrera : String): Array[Profesor] = {
  	val profes = new Array[Profesor](20)
  	var con = 0
  	for(i <- 0 to profesores.length){
  		if(profesores(i).carrera == carrera){
  			profes(i)=profesores(i)
  			con = con+1
  		}
  	}
  	return profes
  }
  def total():Int = {
  	cont
  }
}