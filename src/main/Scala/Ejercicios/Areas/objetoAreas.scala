package Ejercicios.Areas

object areas {
	def main(args:Array[String]){
		
		println("Que desea calcular: \n1.- Circulo\n2.- Rectangulo")
		val opcion = readInt()

		if (opcion == 1){
			println("Ingrese el radio")
			val radio = readDouble()
			val circulo = new circulo(radio)
			println("El area del circulo es: " + circulo.getArea())
		}
		else if (opcion == 2){
			println("Ingrese la base")
			val base = readDouble()
			println("Ingrese la altura")
			val altura = readDouble()
			val rectangulo = new rectangulo(base,altura)
			println("El area del rectangulo es: " + rectangulo.getArea())
		}
		

	}
}
