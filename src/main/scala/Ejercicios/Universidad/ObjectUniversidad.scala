package Ejercicios.Universidad

object Universidad {

	def main(args:Array[String]){

		val alumno = new Alumno()
		val profesor = new Profesor()

		do{
			println("[1]Ingresar Alumno\n[2]Ingresar Profesor\n[3]Mostrar Alumnos\n[4]Mostrar 					Profesores\n[5]Salir")
			var opcion = readInt()	
			if (opcion == 1){
				println("Ingrese el Nombre")
				var name = readString()
				println("Ingrese Numero de Seguridad Social")
				var seguro = readInt()
				println("Ingrese Direccion")
				var direc = readString()
				println("Ingrese Sexo")
				var sex = readString()
				println("Ingrese Fecha de Nacimiento (DD-MM-AAAA)")
				var nacimiento = readString()
				println("Ingrese la Licenciatura")
				var lic = readString()
				println("Ingrese los Años Cursados")
				var años = readInt()
				println("Ingrese Asignatura")
				var materia = r
				
			}else if (opcion == 2){
					println("Ingrese el Nombre")
					var name = readString()
					println("Ingrese Numero de Seguridad Social")
					var seguro = readInt()
					println("Ingrese Direccion")
					var direc = readString()
					println("Ingrese Sexo")
					var sex = readString()
					println("Ingrese Fecha de Nacimiento (DD-MM-AAAA)")
					var nacimiento = readString()
					println("Ingrese Categoria")
					var cat = readString()
					println("Ingrese Numero de Despacho")
					var desp = readInt()
					println("Ingrese Numero de Extension")
					var exten = readInt()
					println("Ingrese Salario")
					var salario = readFloat()
					println("Ingrese Departamento")
					var dep = readString()
				
				}else if (opcion == 3){
						alumno.mostrar()
				

					}else if (opcion == 4){
							profesor.mostrar()
						}	

			}while(opcion != 5)

}

}
