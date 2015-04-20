package Ejercicios.Concesionaria

class Opcion(nombre:String,descripcion:String,costo:Float){

	var name = nombre
	var descrip = descripcion
	var cost = costo 
	
	def costo(): Float = {
		cost
	}

	def mostrar(){
		println("Nombre:" + name)
		println("Descripcion:" + descrip)
		println("Costo:" + cost)
	}
}
