package Ejercicios.Universidad.Funciona

import com.github.nscala_time.time.Imports._

class Persona(val nombre:String,val numss:String,val direccion:String,val sexo:Char,val fechanacimiento:DateTime,carrera:String){

	val c = carrera

	def carrera():String = {
		carrera
	}

}
