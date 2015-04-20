package Ejercicios.Universidad

class Profesores(){
	val profesores = new Array[Profesor](10)
	var i = 0

	def agregar(profesor:Profesor){
		profesores(i) = profesor
		i = i+1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String):Profesor[] = {

	}


}
