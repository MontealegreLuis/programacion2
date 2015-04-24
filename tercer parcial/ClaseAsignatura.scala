package Ejercicios.Universidad

class Asignatura(nombre:String,codigo:String,descripcion:String,departamento:Departamento,carrera:String){
	val nom = nombre
	val code = codigo
	val descri = descripcion
	val depto = departamento
	val carre = carrera

	def Asignatura(nombre:String,codigo:String,descripcion:String,departamento:Departamento){
			val asignatura = new Asignatura(nombre,codigo,descripcion,departamento)
			val asignaturas = new Asignaturas(asignatura)
			asignaturas.agregar(asignatura)	
	} 

}
