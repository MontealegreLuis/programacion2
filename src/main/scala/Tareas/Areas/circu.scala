
class circulo(radio:Double) extends area{

	private val pi:Double = 3.1416	
	private var r = radio
	def getArea(): Double = {
		(r*r)*pi
	}

}
