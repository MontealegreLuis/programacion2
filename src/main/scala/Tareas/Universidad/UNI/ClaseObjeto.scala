package Ejercicios.Universidad.Funciona

import com.github.nscala_time.time.Imports._

object Universidad2{

   def main(args:Array[String]){
	
	print("[ 1] Agregar alumno\n[ 2] Agregar profesor\n[ 3] Agregar asignatura\n[ 4] Agregar departamento\n[ 5] Agregar sección\n[ 6] Inscribir alumno\n[ 7] Calificar alumno\n[ 8] Historial académico\n[ 9] Agregar proyecto\n[10] Agregar profesor a proyecto\n[11] Agregar becario a proyecto\n[12] Buscar proyecto por código\n[13] Salir\n\nIngresa el número de la opción que deseas: ")

	var opcion = readInt()
	
	if (opcion == 1){
		print("Nombre:")
		var nom = readLine()
		print("No. de seguro social:")
		var nss = readLine()
		print("Direccion:")
		var direcc = readLine()
		print("Sexo (M/F):")
		var sex = readChar()
		println("Fecha de Nacimiento (aaaa-mm-dd):")
		print("Ingrese Año:")
		var a = readInt()
		print("Ingrese Mes:")
		var m = readInt()
		print("Ingrese Dia:")
		var d = readInt()
		val birth = new DateTime(a,m,d,0,0)
		print("Carrera:")
		var carre = readLine()
		print("Matricula:")
		var matri = readLine()
		val Alumno = new Alumno(nom,nss,direcc,sex,birth,carre,matri)
		val Alumn = new Alumnos()
		Alumn.agregar(Alumno)
	}
	if (opcion == 2){
		print("Nombre:")
		var nom = readLine()
		print("No. de seguro social:")
		var nss = readLine()
		print("Direccion:")
		var direcc = readLine()
		print("Sexo (M/F):")
		var sex = readChar()
		println("Fecha de Nacimiento (aaaa-mm-dd):")
		print("Ingrese Año:")
		var a = readInt()
		print("Ingrese Mes:")
		var m = readInt()
		print("Ingrese Dia:")
		var d = readInt()
		val birth = new DateTime(a,m,d,0,0)
		print("Carrera:")
		var carre = readLine()
		print("Categoria (HC,TC,MT):")
		var cate = readLine()
		print("Despacho:")
		var desp = readInt()
		print("Extensión:")
		var exten = readInt()
		print("Salario mensual:")
		var salario = readFloat()
		print("Asignar Departamento [s/n]:")
		var c = readChar()
		if (c == 's'){
			print("Ingrese el Nombre:")
			var name = readLine()
			print("Ingrese el Telefono:")
			var tel = readLine()
			print("Ingrese Carrera:")
			var carr = readLine()

		     val Prof = new Profesor(nom,nss,direcc,sex,birth,carre,cate,desp,exten,salario)
			val dep = new Departamento(name,tel,Prof,carr)
			val profes = new Profesores()
			profes.agregar(Prof.asignaradepartamento(dep))			

		}else{
		 val Profesor = new Profesor(nom,nss,direcc,sex,birth,carre,cate,desp,exten,salario)
		 val profes = new Profesores()
		 profes.agregar(Profesor)
		}
	}
  }
}
