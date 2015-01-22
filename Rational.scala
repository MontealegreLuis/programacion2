/*clase que define una fraccion
compuesta por un numerador y denominador
que realiza las operaciones basicas
suma,resta.divicion,multiplicacion,division
*/


class Rational(n: Int , d: Int){
  private val divisor = mcd(n,d)
  val numerador = n / divisor
  val denominador = d / divisor

  private def mcd(a: Int , b: Int):Int={//metodo privado que reduce la fraccion a su menor exprecion
    if(b == 0){
      return a
    }else{
      mcd(b , a % b)
    }
  }

  def add(b: Rational):Rational = {//metodo que suma dos fracciones
    new Rational(numerador * b.denominador + denominador * b.numerador , denominador * b.denominador)
  }

  def subtrac(b: Rational):Rational = {
    new Rational(numerador * b.denominador - b.numerador * denominador , denominador * b.denominador)
  }

  def multiply(b: Rational):Rational ={
    new Rational(numerador * b.numerador , denominador * b.denominador)
  }

  def divide(b: Rational):Rational ={
    new Rational(numerador * b.denominador , denominador * b.numerador)
  }
}
