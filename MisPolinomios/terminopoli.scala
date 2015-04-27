class Polinomio(g: Int){
	val grado = g 
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
	
	def agregartermino(t:termino)={

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
	
	def sumar(b:Polinomio):Polinomio = {
		var g: Int = 0
		var menor = new Polinomio (0)
		var mayor = new Polinomio (0)

		if (this.grado>= b.grado){
			g = this.grado
			val menor = b
			val mayor = this
		}else {
			g = b.grado
			val menor = this
			val mayor = b
		}

		val r = new Polinomio (g)
		for (i <- 0 to menor.grado){
			if (menor.terminos(i) != null  &&  mayor.terminos(i) == null){
				 r.agregartermino(menor.terminos(i))
			}else if (menor.terminos(i) == null && mayor.terminos(i) != null){
					r.agregartermino(mayor.terminos(i))
			}else if (menor.terminos(i) != null && mayor.terminos(i) != null){
					r.agregartermino(menor.terminos(i).reducir(terminos(i)))
			} 
		}
		for (i <- menor.grado to mayor.grado){
			if (mayor.terminos(i) != null){
				r.agregartermino(mayor.terminos(i))
			}		
		}
		r
	}

} 
