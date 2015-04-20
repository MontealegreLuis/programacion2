package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Proyecto(val carrera:String,val nombre:String,val codigo:String,val fechaInicio:DateTime,val subvencion :Float,val institucion:String){
	val profesores = new Profesores()
	val becarios = new Alumnos()
	var contProfesores = 0
	var contBecarios = 0
	def agregarProfesor(profesor:Profesor){
		this.profesores(contProfesores) = profesor
		contProfesores ++
	}
  	def agregarBecario(alumno:Alumno){
  		this.becarios(contBecarios) = becario
  		contBecarios ++
  	}
  	def codigo():String={
  		return this.codigo
  	}
  	def profesor():Array[Profesor]={
  		return this.profesores
  	}
  	def becario():Array[Alumno] = {
  		this.becarios
  	}
  	def Carrera():String={
  		this.carrera
  	}
  	def mostrarDatos(){
  		println("Codigo: " + this.codigo  + " \n")
  		println("Carrera: " + this.carrera  + " \n")
  		println("Nombre: " + this.nombre  + " \n")
  		println("Fecha de Inicio: " + this.fechaInicio + " \n")
  		println("Subvencion: " + this.subvencion + " \n")
  		println("institucion: " + this.institucion + " \n")
  		println("Datos del Investigador \n")
  	}
  	def contadorProfesores():Int={
  		return contProfesores
  	}
  	def contadorBecarios():Int={
  		return contBecarios
  	}
}