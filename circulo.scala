class circulo(t:Double) extends area{

 private val pi:Double = 3.1416	
 private var r = t

 def getArea(): Double = {
   (r*r)*pi
 }

}
