package Ejercicios.Concesionaria

class Modelo(marca:String,nombre:String,cilindrada:Int,año:Int,preciobase:Float){

	var marc = marca
	var nomb = nombre
	var cilin = cilindrada
	var anio = año
	var opcion = new Array[Opcion](10)
	var prec = preciobase
	var i = 0

	def agregaropcion(op:Opcion){
		opcion(i) = op
		i = i+1
	}

	def precio(): Float ={
		prec
	}

	def mostrarnombre(): String = {
		nomb
	}

	def mostraraño(): Int = {
		anio
	}

	def mostrartodo(){
		println("Marca:" + marc)
		println("Nombre:" + nomb)
		println("Cilindrada:" + cilin)
		println("Año:" + anio)
		//opcion.mostrar()
		println("Precio:" + prec)
	}

	def mostrarprecio(): Float = {
		prec
	}

}
