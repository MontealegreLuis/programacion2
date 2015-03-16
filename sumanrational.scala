object Sumanrational{
	def main(args:Array[String]){

	var nu = 0
	var de = 0	
	var n = 0		
	var numero = new Rational(nu , de)
	var r = new Rational(nu , de)
	var numeros = new Array[Rational](n)

	println("Ingrese cuantos racionales se sumaran")
	n = readInt()
		
	for (i <- 0 to n){
		println((i+1) + " ° racional")
		println("Ingrese el numerador")
		nu = readInt()
		println("Ingrese el denominador")
		de = readInt()
		numero = new Rational(nu , de)
		numeros(i) = numero

	}

	for (i <- 0 to n){
		r = r.add(numeros(i))
	}

	
	print("El resultado de la suma es: " + r.mostrar() + "\n")
	
	
}
}
