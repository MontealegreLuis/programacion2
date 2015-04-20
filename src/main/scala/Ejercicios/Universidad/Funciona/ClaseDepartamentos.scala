package Ejercicios.Universidad.Funciona

class Departamentos(){
	val depto = new Array[Departamento](10)	
	var i = 0

	def agregar(departamento:Departamento){
		depto(i) = departamento
		i = i + 1
		println("Registro Exitoso")
	}
}
