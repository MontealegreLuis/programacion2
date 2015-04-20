package Ejercicios.Concesionaria

import com.github.nscala_time.time.Imports._

class Concesionaria(){

	var vehiculos = new Array[Vehiculo](10)
	var vendedores = new Array[Vendedor](10)
	var clientes = new Array[Persona](10)
	var ventas = new Array[Venta](10)
	var i = 0
	var j = 0
	var k = 0
	var m = 0

	def agregarvehiculo(vehiculo:Vehiculo){
		vehiculos(i) = vehiculo
		i = i+1
		println("Registro Exitoso")
	}

	def buscarvehiculospor(nombre:String,año:Int){
		for(x <- vehiculos){
			if((vehiculos(x).mostrarn() == nombre) && (vehiculos(x).mostrara == año)){
				println(vehiculos(x).mostrarcarro())
			}
		}
	}

	def buscarvehiculospor(precio:Float){
		for(x <- vehiculos){
			if((vehiculos(x).mostrarp()) == precio){
				println(vehiculos(x).mostrarcarro())
			}
		}
	}

	def realizarventa(venta:Venta){
		ventas(i) = venta
		j = j+1
		println("Venta Exitosa")
	}

	def agregarcliente(cliente:Persona){
		clientes(m) = cliente
		m = m+1
		println("Registro Exitoso")
	}

	def agregarvendedor(vendedor:Vendedor){
		vendedores(k) = vendedor
		k = k+1
		println("Registro Exitoso")
	}

}
