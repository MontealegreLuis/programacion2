package Ejercicios.Universidad

class Asignaturas( asignatura:Asignatura[] ){
	val asigna = asignatura
	var i = 0
	def agregar(asignatura:Asignatura){
		asigna(i) = asignatura
		i = i + 1
		println("Registro Exitoso") 
	}

	def delacarrera(carrera:String): Asignatura[] = {

	}
}
