package Ejercicios.Concesionaria

import com.github.nscala_time.time.Imports._

class VehiculoVendido(matricula:String,color:String,modelo:Modelo,fechaventa:DateTime,vehiculocedido:VehiculoUsado) extends Vehiculo(matricula,color,modelo){

	var matri = matricula
	var colo = color 
	var model = modelo
	var fecha = fechaventa
	var cedido = vehiculocedido

	def preciofinal(): Float = {
		model.precio()-cedido.rebaja()
	}
}
