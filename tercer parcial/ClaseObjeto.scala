package Ejercicios.Universidad

object Universidad2{

   def main(args:Array[String]){
	

	do{
	print("[ 1] Agregar alumno\n[ 2] Agregar profesor\n[ 3] Agregar asignatura\n[ 4] Agregar departamento\n[ 5] Agregar sección\n[ 6] Inscribir alumno\n[ 7] Calificar alumno\n[ 8] Historial académico\n[ 9] Agregar proyecto\n[10] Agregar profesor a proyecto\n[11] Agregar becario a proyecto\n[12] Buscar proyecto por código\n[13] Salir\nIngresa el número de la opción que deseas: ")

	var opcion = readInt()
	
	if (opcion == 1){
		print("Nombre:")
		var nom = readLine()
		print("\nNo. de seguro social:")
		var nss = readLine()
		print("\nDireccion:")
		var direcc = readLine()
		print("\nSexo (M/F):")
		var sex = readChar()
		print("\nFecha de Nacimiento (aaaa-mm-dd):")
		var nacimie = readLine()
		print("\nCarrera:")
		var carre = readLine()
		print("\nMatricula:")
		var matri = readLine()
		val Alumno = new Alumno(nom,nss,direcc,sex,nacimie,carre,matri)
		val Alumn = new Alumnos(Alumno)
		Alumn.agregar(Alumno)
	}
	if (opcion == 2){
		print("Nombre:")
		var nom = readLine()
		print("\nNo. de seguro social:")
		var nss = readLine()
		print("\nDireccion:")
		var direcc = readLine()
		print("\nSexo (M/F):")
		var sex = readChar()
		print("\nFecha de Nacimiento (aaaa-mm-dd):")
		var nacimie = readLine()
		print("\nCarrera:")
		var carre = readLine()
		print("\nCategoria (HC,TC,MT):")
		var cate = readLine()
		print("\nDespacho:")
		var desp = readInt()
		print("\nExtensión:")
		var exten = readInt()
		print("\nSalario mensual:")
		var salario = readFloat()
		print("\nAsignar Departamento:")
		
		val Profesor = new Profesor(nom,nss,direcc,sex,nacimie,carre,cate,desp,exten,null,salario)
	}
	if (opcion == 3){
		print("Nombre:")
		var nom = readLine()
		print("\nCodigo:")
		var code = readLine()
		print("\nDescripción:")
		var desc = readLine()
		print("\nCarrera:")
		var carrer = readLine()
		println("\nDepartamento:\n[1] Programación\n[2] Matemáticas\n[3] Electrónica")
		var dep = readInt()
		if (dep == 1){
			
		}else if (dep == 2){

		      }else if (dep ==3){

			    }
	}	

	if (opcion == 4){
		print("Ingrese el Nombre:")
		val n = readLine()
		print("\nIngrese Telefono:")
		val tel = readLine()
		print("\nIngrese Director Responsable:")
		print("\nIngrese Carrera:")
	}

   }while(opcion != 13)
}
}
