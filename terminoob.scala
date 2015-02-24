object Polinomio{
	def main(args:Array[String]){

	var terminos = new Array[termino](2)
	var t = new termino (5,2)
	var t2 = new termino (8,2)
	var t3 = new termino (3,3)

	def agregartermino(c:Float,e:Int)={
		val termino = new termino (c,e)
		if (terminos(e)!=null){
			terminos(e)=terminos(e).reducir(termino)
		} else{
			terminos(e) = termino
		}
	}

	def evaluar(x:Float):Float={
		var resultado: Float = 0
		for (termino <- terminos){
			if (termino != null){
				resultado = resultado + termino.evaluar(x)
			}
		}
		resultado
	}

	def mostrar():String = {
		var polinomio = ""
		val grado = 3
		for (i <- 0 to grado-2){
			polinomio = polinomio + terminos(i) + "+" 
		}	
		polinomio = polinomio + terminos(grado-1)
		polinomio
	}

} 

}
