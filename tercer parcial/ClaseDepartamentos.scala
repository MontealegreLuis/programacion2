package Ejercicios.Universidad

class Departamentos(departamentos:Departamento[]){
	val depto = departamentos	
	var i = 0

	def agregar(departamento:Departamento){
		depto(i) = departamento
		i = i + 1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String) : Departamento[] = {
		
	}
}
