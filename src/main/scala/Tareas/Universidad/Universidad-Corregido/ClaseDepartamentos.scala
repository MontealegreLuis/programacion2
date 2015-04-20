package Ejercicios.Universidad

class Departamentos(){
	val depto = new Array[Departamento](10)	
	var i = 0

	def agregar(departamento:Departamento){
		depto(i) = departamento
		i = i + 1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String) : Departamento[] = {
		
	}

	def mostrardeps(carrera:String):{
		var num = 0
		for(x <- depto){
			if (carrera == depto(x).carrera){
			      println("[" + num + "]" + depto(x).mostrar())
			      num = num +1 
			}
		}
	}

	def depescogido(op:Int,carrer:String): Departamento = {
		for (x <- depto){
		    if(carrer == depto(x).carrera){
		       if(depto(op) == depto(x)){
			      return depto(op)
		       }
		    }
		}
	}
}
