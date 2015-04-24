package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Alumno(val nom:String,val numSeguroSocial:String,val dir:String,val sex:Char,val fechaNac:DateTime ,val car :String,val matricula : String)extends Persona(nom,numSeguroSocial,dir,sex,fechaNac,car){
  val historial = new  HistorialAcademico()
  def Matricula():String ={
  	this.matricula
  }
  def materiasSinCalificar():Array[Nota]={
  	val notasSinCalificacion = historial.notasSinCalificacion()
  	return notasSinCalificacion
  }
  def contador():Int ={
  	historial.totalCon()
  }
  def Nombre():String={
  	this.nombre
  }
  def mostrarDatos(){
  	println("Nombre: " + this.nom + " \n")
  	println("Seguro Social: " + this.numSeguroSocial + " \n")
  	println("Direccion: " + this.dir + " \n")
  	println("Sexo: " + this.sex  + " \n")
  	println("Fecha de Nacimiento:" + this.fechaNac  + " \n")
  	println("Carrera: " + this.carrera + " \n")
  	println("Matricula: " + this.matricula)
  }
}
