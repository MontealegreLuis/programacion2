package Ejercicios.Universidad

class Asignaturas(){
	val asigna = new Array[Asignatura](10)
	var i = 0

	def agregar(asignatura:Asignatura){
		asigna(i) = asignatura
		i = i + 1
		println("Registro Exitoso") 
	}

	def delacarrera(carrera:String){

	}

	def mostrarasignaturas(carrera:String){
		var l = 1
		for(Asignatura <- asigna){
		     if(carrera == asigna(Asignatura).mostrarcarrera()){
			     println("[" + l + "]" + asigna(Asignatura).mostrar())
			     l = l+1
		     }
		}
	}

	def asignaturaescogida(carrera:String,op:Int): Asignatura = {
		for (Asignatura <- asigna){
		    if(carrera == asigna(Asignatura).mostrarcarrera()){
		       if(asigna(op) == asigna(Asignatura)){
			      return asigna(op)
		       }
		    }
		}
	}
}
