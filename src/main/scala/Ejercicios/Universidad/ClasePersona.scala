package Ejercicios.Universidad

import com.github.nscala_time.time.Imports._

class Persona(val nombre:String,val numss:String,val direccion:String,val sexo:char,val fechanacimiento:DateTime,val carrera:String){

	def carrera():String = {
		carrera
	}

}
