package Ejercicios.Rational

object Sumarational{
	def main(args:Array[String]){
	var numerador = 0
	var denominador = 0
	var numerador2 = 0
	var denominador2 = 0
		
	
	println("Primer racional")
	println("Ingrese el numerador")
	numerador = readInt()
	println("Ingrese el denominador")
	denominador = readInt()
	val r1 = new Rational(numerador,denominador)

	println("Segundo racional")
	println("Ingrese el numerador")
	numerador2 = readInt()
	println("Ingrese el denominador")
	denominador2 = readInt()
	val r2 = new Rational(numerador2,denominador2)

	val r3 = r1.add(r2)

	print(r1.mostrar() + "+" + r2.mostrar())
	print(" = ")
	print(r3.mostrar() + "\n")	
}
}
