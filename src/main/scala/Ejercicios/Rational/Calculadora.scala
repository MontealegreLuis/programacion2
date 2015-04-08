package Ejercicios.Rational

object Calculadora{

     def main(args:Array[String]){

	println("[1]Suma\n[2]Resta\n[3]Multiplicacion\n[4]Division")
	val opcion = readInt()

	if(opcion == 1){
		println("Primer racional")
		println("Ingrese el numerador")
		var numerador = readInt()
		println("Ingrese el denominador")
		var denominador = readInt()
		val r1 = new Rational(numerador,denominador)

		println("Segundo racional")
		println("Ingrese el numerador")
		var numerador2 = readInt()
		println("Ingrese el denominador")
		var denominador2 = readInt()
		val r2 = new Rational(numerador2,denominador2)

		val r3 = r1.add(r2)

		print(r1.mostrar() + "+" + r2.mostrar())
		print(" = ")
		print(r3.mostrar() + "\n")	
	}else if(opcion == 2){
			println("Primer racional")
			println("Ingrese el numerador")
			var numerador = readInt()
			println("Ingrese el denominador")
			var denominador = readInt()
			val r1 = new Rational(numerador,denominador)
	
			println("Segundo racional")
			println("Ingrese el numerador")
			var numerador2 = readInt()
			println("Ingrese el denominador")
			var denominador2 = readInt()
			val r2 = new Rational(numerador2,denominador2)
	
			val r3 = r1.subtract(r2)
	
			print(r1.mostrar() + "-" + r2.mostrar())
			print(" = ")
			print(r3.mostrar() + "\n")
		}else if(opcion == 3){
				println("Primer racional")
				println("Ingrese el numerador")
				var numerador = readInt()
				println("Ingrese el denominador")
				var denominador = readInt()
				val r1 = new Rational(numerador,denominador)
		
				println("Segundo racional")
				println("Ingrese el numerador")
				var numerador2 = readInt()
				println("Ingrese el denominador")
				var denominador2 = readInt()
				val r2 = new Rational(numerador2,denominador2)
		
				val r3 = r1.multiply(r2)
		
				print(r1.mostrar() + "*" + r2.mostrar())
				print(" = ")
				print(r3.mostrar() + "\n")
			}else if(opcion == 4){
					println("Primer racional")
					println("Ingrese el numerador")
					var numerador = readInt()
					println("Ingrese el denominador")
					var denominador = readInt()
					val r1 = new Rational(numerador,denominador)
			
					println("Segundo racional")
					println("Ingrese el numerador")
					var numerador2 = readInt()
					println("Ingrese el denominador")
					var denominador2 = readInt()
					val r2 = new Rational(numerador2,denominador2)
			
					val r3 = r1.divide(r2)
			
					print(r1.mostrar() + "/" + r2.mostrar())
					print(" = ")
					print(r3.mostrar() + "\n")
						
				}

  }
}
