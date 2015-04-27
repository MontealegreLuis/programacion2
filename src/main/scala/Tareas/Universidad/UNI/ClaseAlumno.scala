package Ejercicios.Universidad.Funciona

import com.github.nscala_time.time.Imports._

class Alumno(nombre:String,numss:String,direccion:String,sexo:Char,fechanacimiento:DateTime, carrera:String,matricula:String) extends Persona(nombre,numss,direccion,sexo,fechanacimiento,carrera){

	var matricul = matricula

	def matricula():String = {
		matricul
	}

}
