class Racional(n: Int , d: Int){
  private val div = mcd(n,d)
  val numerador = n/div
  val denominador = d/div
  def suma(b: Racional):Racional={
    new Racional(numerador*b.denominador+denominador*b.numerador,denominador* b.denominador)
  }
  private def mcd(a: Int , b: Int):Int={
   if(b == 0){
      return a
    }
    else{
      mcd(b,a%b)
    }
  }
  def resta(b: Racional):Racional={
    new Racional(numerador*b.denominador-b.numerador*denominador,denominador*b.denominador)
  }
  def multiplica(b: Racional):Racional={
    new Racional(numerador* b.numerador,denominador*b.denominador)
  }
  def division(b: Racional):Racional={
    new Racional(numerador*b.denominador,denominador*b.numerador)
  }
}
