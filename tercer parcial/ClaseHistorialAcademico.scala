package Ejercicios.Universidad

class HistorialAcademico(notas:Nota[]){
	val note = notas
	var i = 0

	def agregarnota(nota:Nota){
		note(i) = nota
		i = i + 1
	}


}
