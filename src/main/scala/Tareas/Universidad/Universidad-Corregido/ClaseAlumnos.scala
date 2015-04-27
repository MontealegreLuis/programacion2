package Ejercicios.Universidad

class Alumnos(){
	val alumns = new Array[Alumno](10)
	var i = 0

	def agregar(alumno:Alumno){
		alumns(i) = alumno
		i = i + 1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String):Alumno[] = {
		
	}

	def conmatricula(matricula:String):Alumno[] = {

	}

}
