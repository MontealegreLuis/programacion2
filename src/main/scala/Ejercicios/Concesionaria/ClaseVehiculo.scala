package Ejercicios.Concesionaria

import com.github.nscala_time.time.Imports._

class Vehiculo(matricula:String,color:String,modelo:Modelo){

	var matri = matricula
	var colo = color
	var model = modelo

	def mostrarn(): String = {
		model.mostrarnombre()
	}

	def mostrara(): Int = {
		model.mostraraño()
	}

	def mostrarp(): Float = {
		model.mostrarprecio()
	}

	def mostrarcarro(){
		println("Matricula:" + matri)
		println("Color:" + colo)
		model.mostrartodo()
	}
}
