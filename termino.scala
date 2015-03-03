class termino(c: Float, e: Int){
	private val coeficiente = c
	private val exponente = e
	
	def evaluar(x:Float):Float = {
		var resultado: Float = 1	
		for (i <- 1 to exponente){
		      resultado = resultado * x 	
		}
		
		resultado = resultado * coeficiente
		resultado	
	}

	def terminosiguales(t:termino):Boolean = { 
		 (c != this.exponente)
	}
	
	def reducir(t:termino):termino = {		
		if (e == this.exponente){
		       var te = new termino(this.coeficiente+c,e)
		       te
		}
		else{ 
			t
		}
	}	
	def esigual(){

	}
	def mostrar(){

	}

}
