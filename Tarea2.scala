class Rational(n: Int, d: Int){
  private val divisor = gcd(n, d)

  val numerator: Int = n / divisor
  val denominator: Int = d / divisor

  def this(n: Int) = this(n, 1)

  def suma(b:Rational): Rational = {
      new Rational (numerator * b.denominator + denominator * b.numerator, denominator * b.denominator)
    }
  
  def resta(b:Rational): Rational = {
      new Rational (numerator * b.denominator - denominator * b.numerator, denominator * b.denominator)
    }
  def mult (b:Rational) : Rational = {
      new Rational ( numerator * b.numerator , denominator * b.denominator )
    }
  def division (b:Rational): Rational = {
      new Rational( numerator * b.denominator , b.numerator * denominator )
    }
}
