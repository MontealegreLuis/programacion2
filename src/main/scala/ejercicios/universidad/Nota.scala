package ejercicios.universidad
class Nota(sec:Seccion){
  val seccion=sec
  val calificacion :Float =0 
  def tieneCalificacion():Boolean = {
  	if(this.calificacion == 0){
  		false
  	}
  }
  def Calificar(calificacion : Int){
  	this.calificacion = calificacion
  }
}
