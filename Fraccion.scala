class Fraccion (n: Int, d:Int)
{
  //estos son los atributos
    val numerador = n
    val denominador =d
  // Segundo contructor
  def  this(n: Int) = this(n,1)

  //cracion de un objeto
  val par = new Fraccion(1,2)

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
