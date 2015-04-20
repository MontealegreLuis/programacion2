package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class HistorialAcademico {
	var con =0
  val notas = new Array [Nota](20)
  def agregarNota(nota:Nota){
  	notas(con) = nota
  	con ++ 
  }
  def notasSinCalificacion(): Array[Nota] = {
  	val notaSinCal = new Array[Nota](10)
  	var con = 0
  	for(i <- 0 to notas.length){
  		if(notas(i).tieneCalificacion() == false){
  			notaSinCal(i) = notas(i)
  			con ++
  		}
  	}
  	return notaSinCal
  }
  def totalCon():Int={
  	con
  }
}
