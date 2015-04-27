package Ejercicios.Universidad

class Alumno(nombre:String,numss:String,direccion:String,sexo:char,fechanacimiento:DateTime, carrera:String,matricula:String,historial:HistorialAcademico) extends Persona(nombre,numss,direccion,sexo,fechanacimiento,carrera){

	def matricula():String = {
		matricula
	}

}
