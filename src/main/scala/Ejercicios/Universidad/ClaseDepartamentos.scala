package Ejercicios.Universidad

class Departamentos(){
	val depto = new Array[Departamento](10)	
	var i = 0

	def agregar(departamento:Departamento){
		depto(i) = departamento
		i = i + 1
		println("Registro Exitoso")
	}

	def delacarrera(carrera:String){
		
	}

	def mostrardeps(carrera:String){
		var num = 0
		for(Departamento <- depto){
			if (carrera == depto(Departamento).carrera){
			      println("[" + num + "]" + depto(Departamento).mostrar())
			      num = num +1 
			}
		}
	}

	def depescogido(op:Int,carrer:String): Departamento = {
		for (Departamento <- depto){
		    if(carrer == depto(Departamento).carrera){
		       if(depto(op) == depto(Departamento)){
			      return depto(op)
		       }
		    }
		}
	}
}
