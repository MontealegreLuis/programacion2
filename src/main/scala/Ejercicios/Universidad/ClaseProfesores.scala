package Ejercicios.Universidad

class Profesores(){
	val profesores = new Array[Profesor](10)
	var i = 0

	def agregar(profesor:Profesor){
		profesores(i) = profesor
		i = i+1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String){

	}

	def mostrarprofes(carrera:String){
		var l = 1
		for(Profesor <- profesores){
		     if(carrera == profesores(Profesor).mostrarcarrera()){
			     println("[" + l + "]" + profesores(Profesor).mostrar())
			     l = l+1
		     }
		}
	}

	def profeescogido(carrera:String,op:Int): Profesor = {
		for (Profesor <- profesores){
		    if(carrera == profesores(Profesor).mostrarcarrera()){
		       if(profesores(op) == profesores(Profesor)){
			      return profesores(op)
		       }
		    }
		}
	}
}
