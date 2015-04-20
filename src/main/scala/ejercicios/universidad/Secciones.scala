package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Secciones{
	val secciones = new Array[Seccion](20)
	def agregar(seccion : Seccion){
		secciones(cont) = seccion
    	cont++
	}
	def total():Int = {
  		cont
  	}
	def queCoincidanCon(carrera: String,cuatrimestre : String,anio : Int ): Array[Seccion] = {
		val sec = new secciones()
  		var con = 0
  		for(i <- 0 to secciones.length){
  			if(secciones(i).carrera == carrera && secciones(i).cuatrimestre == cuatrimestre && secciones(i).anio == anio){
  				sec(i)=secciones(i)
  				con ++
  			}
  		}
  		return profes
	}
	def total():Int = {
  		cont
  	}
}