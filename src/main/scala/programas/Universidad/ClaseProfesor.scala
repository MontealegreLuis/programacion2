package Ejercicios.Universidad.Funciona

import com.github.nscala_time.time.Imports._

class Profesor(nombre:String,numss:String,direccion:String,sexo:Char,fechanacimiento:DateTime, carrera:String,categoria:String,despacho:Int,extension:Int,salario:Float,private var depa: Departamento = null) extends Persona(nombre,numss,direccion,sexo,fechanacimiento,carrera){

	var name = nombre
	var nss = numss
	var direcc = direccion
	var sex = sexo
	var nacimiento = fechanacimiento
	var carrer = carrera
	var cate = categoria
	var des = despacho
	var exten = extension
	var sal = salario	

	def asignaradepartamento(departamento:Departamento): Profesor = {
		depa = departamento
		new Profesor(name,nss,direcc,sex,nacimiento,carrer,cate,des,exten,sal,depa) 
	}

	def mostrar(): String ={
		name
	}

	def mostrarcarrera():String = {
		carrer
	}	
}
