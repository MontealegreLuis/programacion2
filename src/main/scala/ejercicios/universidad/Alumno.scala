package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Alumno(val nom:String,val numSeguroSocial:String,val dir:String,val sex:Char,val fechaNac:DateTime ,val carrera :String,val matricula : String)extends Persona(nom,numSeguroSocial,dir,sex,fechaNac,carre){
  val historial : HistorialAcademico
  def matricula():String ={
  	this.matricula
  }
  def materiasSinCalificar():Array[Nota]={
  	val notasSinCalificacion = historal.notasSinCalificacion()
  	return notasSinCalificacion
  }
  def contador():Int ={
  	historial.totalCon()
  }
  def nombre():String={
  	this.nombre
  }
  def mostrarDatos(){
  	println("Nombre: " + this.nom + " \n")
  	println("Seguro Social: " + this.segSocial + " \n")
  	println("Direccion: " + this.segSocial + " \n")
  	println("Sexo: " + this.sex  + " \n")
  	println("Fecha de Nacimiento:" + this.fechaNac  + " \n")
  	println("Carrera: " + this.carrera + " \n")
  	println("Matricula: " + this.matricula)
  }
}
