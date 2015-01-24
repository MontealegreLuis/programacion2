class Rational (n: Int, d: Int){

	private val divisor = gcd(n.abs, d.abs)

	val numerator = n /divisor

	val denominador = d /divisor

	private def gcd(a: Int, b: Int): Int ={
		if( b == 0 ){
			a
		}else{
			gcd( b, a % b )
		}
	}
}

def add( b: Rational ): Rational = {
	new Rational ( numerator * b.denominador + denominador * b.numerator , denominador * b.denominador)
}

def subtrac( b: Rational ): Rational = {
	new Rational( numerator*b.denominador - b.numerator* denominador , denominador * b.denominador )
}

def multiply( b: Rational ): Rational = {
	new Rational( numerator* b.numerator , denominador * b.denominador )
	
}

def divide( b:Rational ): Rational = {
	new Rational( numerator * b.denominador , denominador * b.numerator)
}