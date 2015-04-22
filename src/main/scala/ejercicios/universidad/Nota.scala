package ejercicios.universidad
class Nota(sec:Seccion){
  val seccion=sec
  var calificacion :Float = 0
  def tieneCalificacion():Boolean = {
  	this.calificacion == 0
  }
  def Calificar(cali : Int){
  	this.calificacion = cali
  }
}
