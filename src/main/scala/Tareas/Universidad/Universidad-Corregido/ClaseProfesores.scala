package Ejercicios.Universidad

class Profesores(){
	val profesores = new Array[Profesor](10)
	var i = 0

	def agregar(profesor:Profesor){
		profesores(i) = profesor
		i = i+1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String):Profesor[] = {

	}

	def mostrarprofes(carrera:String):{
		var l = 1
		for(x <- profesores){
		     if(carrera == profesores(x).mostrarcarrera()){
			     println("[" + l + "]" + profesores(x).mostrar())
			     l = l+1
		     }
		}
	}

	def profeescogido(carrera:String,op:Int): Profesor = {
		for (x <- profesores){
		    if(carrera == profesores(x).mostrarcarrera()){
		       if(profesores(op) == profesores(x)){
			      return profesores(op)
		       }
		    }
		}
	}
}
