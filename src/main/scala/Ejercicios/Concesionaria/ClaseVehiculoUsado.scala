package Ejercicios.Concesionaria

import com.github.nscala_time.time.Imports._

class VehiculoUsado(matricula:String,color:String,modelo:Modelo,kilometraje:Float)extends Vehiculo(matricula,color,modelo){

	var matri = matricula
	var colo = color 
	var model = modelo
	var km = kilometraje

	def rebaja(): Float = {
		model.precio()
	}

}
