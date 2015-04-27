package Ejercicios.Universidad

class Asignaturas(){
	val asigna = new Array[Asignatura](10)
	var i = 0

	def agregar(asignatura:Asignatura){
		asigna(i) = asignatura
		i = i + 1
		println("Registro Exitoso") 
	}

	def delacarrera(carrera:String): Asignatura[] = {

	}

	def mostrarasignaturas(carrera:String):{
		var l = 1
		for(x <- asigna){
		     if(carrera == asigna(x).mostrarcarrera()){
			     println("[" + l + "]" + asigna(x).mostrar())
			     l = l+1
		     }
		}
	}

	def asignaturaescogida(carrera:String,op:Int): Asignatura = {
		for (x <- asigna){
		    if(carrera == asigna(x).mostrarcarrera()){
		       if(asigna(op) == asigna(x)){
			      return asigna(op)
		       }
		    }
		}
	}
}
