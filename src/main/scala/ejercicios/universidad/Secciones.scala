package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Secciones{
  var cont = 0
  var con = 0
	val secciones = new Array[Seccion](20)
	def agregar(seccion : Seccion){
		secciones(cont) = seccion
    	cont=cont+1
	}
	def total():Int = {
  		cont
  	}
	def queCoincidanCon(carrera: String,cuatrimestre : String,anio : Int ): Array[Seccion] = {
		val sec = new Array[Seccion](20)
  		for(i <- 0 to secciones.length){
  			if(secciones(i).carrera == carrera && secciones(i).cuatrimestre == cuatrimestre && secciones(i).anio == anio){
  				sec(i)=secciones(i)
  				con=con+1
  			}
  		}
  		return sec
	}
	def totalCon():Int = {
  		con
  	}
}