package Ejercicios.Universidad

class Proyectos(){
	val proyectos = new Array[Proyecto](10)
	var i = 0

	def agregar(proyecto:Proyecto){
		proyectos(i) = proyecto
		i = i+1
		println("Registro Exitoso")
	}

	def cooncodigo(codigo:String):Proyecto = {

	}
}
