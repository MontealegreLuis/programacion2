package Ejercicios.Universidad

class Secciones(){
	val secciones = new Array[Seccion](10)
	var i = 0

	def agregar(seccion:Seccion){
		secciones(i) = seccion
		i = i+1
		println("Registro Exitoso")
	}

	def quecoincidancon(carrera:String,cuatrimestre:String,año:Int):Seccion[] = {
		for(x <- secciones){
			
		}
	}

}
