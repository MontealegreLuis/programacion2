package Ejercicios.Universidad

import com.github.nscala_time.time.Imports._

object Universidad2{

   def main(args:Array[String]){
	
	print("[ 1] Agregar alumno\n[ 2] Agregar profesor\n[ 3] Agregar asignatura\n[ 4] Agregar departamento\n[ 5] Agregar sección\n[ 6] Inscribir alumno\n[ 7] Calificar alumno\n[ 8] Historial académico\n[ 9] Agregar proyecto\n[10] Agregar profesor a proyecto\n[11] Agregar becario a proyecto\n[12] Buscar proyecto por código\n[13] Salir\nIngresa el número de la opción que deseas: ")

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
		print("Fecha de Nacimiento (aaaa-mm-dd):")
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
		print("Fecha de Nacimiento (aaaa-mm-dd):")
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
		     val Prof = new Profesor(nom,nss,direcc,sex,birth,carre,cate,desp,exten,null,salario)
			val dep = new Departamento(name,tel,Prof,carr)
			val profes = new Profesores()
			profes.agregar(Prof.asignaradepartamento(dep))			
		}else{
		 val Profesor = new Profesor(nom,nss,direcc,sex,birth,carre,cate,desp,exten,null,salario)
		 val profes = new Profesores()
		 profes.agregar(Profesor)
		}
	}
	if (opcion == 3){
		print("Nombre:")
		var nom = readLine()
		print("Codigo:")
		var code = readLine()
		print("Descripción:")
		var desc = readLine()
		print("Carrera:")
		var carrer = readLine()
		print("Departamento:")
		val dep = new Departamentos() 
		dep.mostrardeps(carrer)
		var escoje = readInt()
		val depar = dep.depescogido(escoje,carrer)
		val asig1 = new Asignatura(nom,code,desc,depar,carrera)
		val asign = new Asignaturas()
		asign.agregar(asig1)
	}	

	if (opcion == 4){
		print("Ingrese el Nombre:")
		val n = readLine()
		print("Ingrese Telefono:")
		val tel = readLine()
		print("Ingrese Carrera:")
		var carr = readLine()
		print("Director:")
		val p = new Profesores()
		p.mostrarprofes()
		val pr = readInt()
		val profe = p.profeescogido(carr,pr)
		val dep = new Departamento(n,tel,profe,carr)
		val deptos = new Departamentos()
		deptos.agregar(dep)
	}

	if (opcion == 5){
		print("Ingrese Carrera:")
		val carrera = readString()
		print("Ingrese Grupo:")
		val group = readInt()
		print("Ingrese Cuatrimestre (Primavera/Verano/Otoño:")
		val cuatri = readLine()
		print("Ingrese Año:")
		val anio = readInt()
		print("Asignatura:")
		val asi = new Asignaturas()
		asi.mostrarasignaturas()
		val eleccion = readInt()
		val asignaescogida = asi.asignaturaescogida(carrera,eleccion)
		print("Profesor:")
		val p = new Profesores()
		p.mostrarprofes()
		val pr = readInt()
		val profe = p.profeescogido(carrera,pr)
		val seccion = new Seccion(asignaescogida,group,profe,cuatri,anio)
		val secciones = new Secciones()
		secciones.agregar(seccion)
	}

	if (opcion == 6){
		print("Ingrese Carrera:")
		val carr = readLine()
		print("Ingrese Cuatrimestre (Primavera/Verano/Otoño):")
		val cuatri = readLine()
		print("Ingrese Año:")
		val añio = readInt()
		print("Seccion:")
		
				
	}
 }
}
