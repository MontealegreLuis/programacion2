class Fraccion(n:Int, d:Int)
{
  val numerador=n
  val denominador=d
  //Esto nos sirve por si se da un numero entero
  def this (n:Int)=this (n,1)

  val a = new Fraccion (n,d)
  val b = new Fraccion (n,d)

  def suma (d:Fraccion):Fraccion=
  {
    new Fraccion(
    this.numerador * d.denominador + this.denominador * d.numerador,
    this.denominador * d.denominador)
  }

  def resta(d:Fraccion):Fraccion=
  {
    new Fraccion(
    this.numerador * d.denominador - this.denominador * d.numerador,
    this.denominador * d.denominador)
  }

  def multiplicacion(d:Fraccion):Fraccion=
  {
    new Fraccion(
    this.numerador * d.numerador,
    this.denominador *d.denominador)
  }

  def division(d:Fraccion):Fraccion=
  {
    new Fraccion(
    this.numerador * d.denominador,
    this.denominador * d.numerador
    )
  }
}
