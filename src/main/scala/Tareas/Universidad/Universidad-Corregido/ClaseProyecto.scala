package Ejercicios.Universidad

import com.github.nscala_time.time.Imports._

class Proyecto(carrera:String,nombre:String,codigo:String,fechainicio:DateTime,subvencion:Float,institucion:String,investigador:Profesor,profesores:Profesores,becarios:Alumnos){

	var carrer = carrera
	var code = codigo

	def agregarprofesor(profesor:Profesor){

	}

	def agregarbecario(alumno:Alumno){

	}

	def codigo():String = {
		code
	}

	def carrera():String = {
		carrer
	}
}
