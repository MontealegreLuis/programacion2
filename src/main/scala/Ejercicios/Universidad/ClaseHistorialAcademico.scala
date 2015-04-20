package Ejercicios.Universidad

class HistorialAcademico(){
	val note = new Array[Nota](10)
	var i = 0

	def agregarnota(nota:Nota){
		note(i) = nota
		i = i + 1
	}


}
