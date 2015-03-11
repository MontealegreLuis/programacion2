object Polinomio{

	def main(args:Array[String]){

	var G1 = 0 
	var G2 = 0
	var mayor = 0
	var DG = 0
	var A1 = new Array[Termino](G1) 
	var A2 = new Array[Termino](G2)
	var A3 = new Array[Termino](mayor)
	var c = 0
	var termino = new Termino(c,G1)

	println("Ingrese grado de Polinomio 1")
	G1 = readInt()

	println("\nIngresa coeficientes")
	
	for(i <- 0 to G1){
		println("Coeficiente "+ (i+1))
		c = readInt()
		termino = new Termino(c,(G1-i))		
		A1(i) = termino
	}

	println("\nIngrese grado de Polinomio 2")
	G2 = readInt()

	println("\nIngresa coeficientes")
	
	for(i <- 0 to G2){
		println("Coeficiente "+ (i+1))
		c = readInt()
		termino = new Termino(c,(G2-i))		
		A2(i) = termino
	}
}

}
