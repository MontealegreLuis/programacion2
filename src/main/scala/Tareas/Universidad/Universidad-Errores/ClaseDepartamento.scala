package Ejercicios.Universidad

class Departamento(nombre:String,telefono:String,director:Profesor,carrera:String){
	val nomb = nombre
	val tel = telefono
	val direc = director
	val carrer = carrera

	def departamento(nombre:String,telefono:String,director:Profesor){
		val depto = new Departamento(nombre,telefono,director)
		val deptos = new Departamentos(depto)
		deptos.agregar(depto)
	}

	def carrera():String = {
		carrer
	}
}
