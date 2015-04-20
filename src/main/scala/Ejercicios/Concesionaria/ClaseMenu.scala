package Ejercicios.Concesionaria

import com.github.nscala_time.time.Imports._

object Menu {

   def main(args:Array[String]){

	println("[1]Agregar Vehiculos\n[2]Buscar Vehiculos por modelo (Nombre y Año)\n[3]Buscar Vehiculos por Precio\n[4]Vender un Vehiculo\n[5]Agregar Clientes\n[6]Revisar las ventas de un Vendedor\n[7]Agregar Vendedores\n\nIngrese Opcion:")

	var opcion = readInt()

	if(opcion == 1){
		print("Ingrese Matricula:")
		val matricula = readLine()
		print("Ingrese Color:")
		val color = readLine()
		print("Ingrese Modelo:")
		print("   Ingrese Marca:")
		val marca = readLine()
		print("   Ingrese Nombre:")
		val nombre = readLine()
		print("   Ingrese Cilindrada:")
		val cilindrada = readInt()
		print("   Ingrese Año:")
		val año = readInt()
		print("   Ingrese Precio:")
		val precio = readFloat()

		val model = new Modelo(marca,nombre,cilindrada,año,precio)
		val coche = new Vehiculo(matricula,color,model)
		val coches = new Concesionaria()
		choches.agregarvehiculo(coche)
	}

	if(opcion == 2){
		print("Ingrese Nombre:")
		val name = readLine()
		print("Ingrese Año:")
		val anio = readInt()
		val busca = new Concesionaria()
		busca.buscarvehiculospor(name,anio)
	}

	if(opcion == 3){
		print("Ingrese Precio:")
		val pre = readFloat()
		val busc = new Concesionaria()
		busc.buscarvehiculospor(pre)
	}

	if(opcion == 4){
		print("Cedera su auto [s/n]:")
		var sino = readChar()
		if(sino == 's'){
			print("Ingrese Matricula:")
			val matricula = readLine()
			print("Ingrese Color:")
			val color = readLine()
			println("Ingrese Modelo:")
			print("   Ingrese Marca:")
			val marca = readLine()
			print("   Ingrese Nombre:")
			val nombre = readLine()
			print("   Ingrese Cilindrada:")
			val cilindrada = readInt()
			print("   Ingrese Año:")
			val año = readInt()
			print("   Ingrese Precio:")
			val precio = readFloat()
			print("Ingrese Kilometraje:")
			val km = readFloat()
			
			val mod = new Modelo(marca,nombre,cilindrada,año,precio)
			val usado = new VehiculoUsado(matricula,color,mod,km)
			

			val vendido = new VehiculoVendido()
		}
	}	

	if (opcion == 5){
		print("Ingrese INE:")
		val ine = readLine()
		print("Ingrese Nombre:")
		val nom = readLine()
		print("Ingrese Direccion:")
		val dire = readLine()
		print("Ingrese Telefono:")
		val tel = readLine()

		val client = new Persona(ine,nom,dire,tel)
		val conce = new Concesionaria()
		conce.agregarcliente(client)
	}

	if (opcion == 6){

	}

   }
}
