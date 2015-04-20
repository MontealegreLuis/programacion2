package Ejercicios.Universidad

import com.github.nscala_time.time.Imports._

class Alumno(nombre:String,numss:String,direccion:String,sexo:char,fechanacimiento:DateTime, carrera:String,matricula:String,historial:HistorialAcademico) extends Persona(nombre,numss,direccion,sexo,fechanacimiento,carrera){

	var matricul = matricula

	def matricula():String = {
		matricul
	}

}
