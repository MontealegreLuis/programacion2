class t2Fraccion (n:Int, m:Int)
{

  def  this(n: Int) = this(n,1)

  private val divisor = gcd( n.abs, m.abs )

  val numerador = n / divisor
  val denominador = m / divisor

  private def gcd( a:Int , b:Int ): Int =
  {
      if (b==0)
      {
        a
      }

      else {

        gcd(b,a%b)
      }


  }

  def Suma(b:Fraccion): Fraccion =
  {
     new Fraccion (numerador * b.denominador + denominador * b.numerador, denominador * b.denominador)
  }

  def Resta(b:Fraccion): Fraccion =
    {
      new Fraccion (numerador * b.denominador - denominador * b.numerador, denominador * b.denominador)
    }

  def Multiplicacion (b:Fraccion) : Fraccion =
   {
        new Fraccion ( numerador * b.numerador , denominador * b.denominador )
   }

  def Division (b:Fraccion): Fraccion =
   {
        new Fraccion( numerador * b.denominador , b.numerador * denominador )
   }


}
