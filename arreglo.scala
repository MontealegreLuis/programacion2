object Polinomio{

	def main(args:Array[String]){

	var G1 = 0 
	var G2 = 0
	var mayor = 0
	var DG = 0
	var A1 = new Array[Int](7) 
	var A2 = new Array[Int](7)
	var A3 = new Array[Int](7)

	println("Ingrese grado de Polinomio 1")
	G1 = readInt()

	println("\nIngresa coeficientes")
	
	for(i <- 0 to G1){
		println("Coeficiente "+ (i+1))
		A1(i) = readInt()
	}

	println("\nIngrese grado de Polinomio 2")
	G2 = readInt()

	println("\nIngresa coeficientes")
	
	for(i <- 0 to G2){
		println("Coeficiente "+ (i+1))
		A2(i) = readInt()
	}
	
	if(G2<G1){
		DG = G1 - G2
		mayor = G1
		for(i <- 0 to DG){		
			A3(i) = A1(i)
		}
		for(i <- DG to G1){
		   A3(i) = A1(i) + A2(i-DG)
		}
	}else if(G1<G2){
		DG = G2 - G1
		mayor = G2
		for(i <- 0 to DG){		
			A3(i) = A2(i)
		}
		for(i <- DG to G2){
		   A3(i) = A1(i-DG) + A2(i)
		}
	
	}else{
		mayor = G1
		for(i <- 0 to G1){
			A3(i) = A1(i) + A2(i)
		}
	}

	println("Resultado:")
	for(i <- 0 to mayor-1){
		print(A3(i) + "x^" + (mayor-i) + "+")
	}
	print(A3(mayor))

}

}
