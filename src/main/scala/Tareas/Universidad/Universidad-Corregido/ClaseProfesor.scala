package Ejercicios.Universidad

import com.github.nscala_time.time.Imports._

class Profesor(nombre:String,numss:String,direccion:String,sexo:char,fechanacimiento:DateTime, carrera:String,categoria:String,despacho:Int,extension:Int,departamento:Departamento,salario:Float) extends Persona(nombre,numss,direccion,sexo,fechanacimiento,carrera){

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

	def asignaradepartamento(departamento:Departamento){
		val dep = departamento
		new Profesor(name,nss,direcc,sex,nacimiento,carrer,cate,des,exten,dep,salario) 
	}

	def mostrar(): String ={
		name
	}

	def mostrarcarrera():String = {
		carrer
	}	
}
