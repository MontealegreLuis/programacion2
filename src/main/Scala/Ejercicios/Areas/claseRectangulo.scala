package Ejercicios.Areas

class rectangulo(base:Double,altura:Double) extends area{
	
	private var b = base 
	private var a = altura 
	
	def getArea(): Double = {
		b*a
	}

}
