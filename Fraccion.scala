class Fraccion (n: Int, d:Int)
{
  //estos son los atributos

  // Segundo contructor
  def  this(n: Int) = this(n,1)

  private val divisor = gcd( n.abs, d.abs )

  val numerador = n / divisor
  val denominador = d / divisor

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


  // creacion de los metodos de la interfaz
  def suma(b:Fraccion): Fraccion =
  {
     new Fraccion (numerador * b.denominador + denominador * b.numerador, denominador * b.denominador)
  }

  def resta(b:Fraccion): Fraccion =
    {
      new Fraccion (numerador * b.denominador - denominador * b.numerador, denominador * b.denominador)
    }

  def multiplicacion (b:Fraccion) : Fraccion =
   {
        new Fraccion ( numerador * b.numerador , denominador * b.denominador )
   }

  def division (b:Fraccion): Fraccion =
   {
        new Fraccion( numerador * b.denominador , b.numerador * denominador )
   }


}
