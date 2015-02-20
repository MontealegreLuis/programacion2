class Fraccion(n:Int, d:Int)
{
  private val divisor = mcd(n.abs,d.abs)
          val numerador=n
          val denominador=d
          //Esto nos sirve por si se da un numero entero
          def this (n:Int)=this (n,1)

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
  private def mcd(a: Int, b: Int): Int= {
    if (b==0){
      a
      }
    else{
      mcd(b,a % b)
    }
  }
}
