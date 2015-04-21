class Rational(n: Int, d: Int) {
    val numerador = n
    val denominador = d
    def mostrar(): String = {
    numerador + "/" + denominador
  }
    def sumar(t: Rational): Rational = {
    return new Rational(numerador * t.denominador + denominador * t.numerador,denominador * t.denominador)
  }
    def restar(t: Rational): Rational = {
    return new Rational(numerador * t.denominador - denominador * t.numerador,denominador * t.denominador)
  }
    def multiplicar(t: Rational): Rational = {
    return new Rational(numerador * t.numerador ,denominador * t.denominador)
  }
    def dividir(t: Rational): Rational = {
    return new Rational(numerador * t.denominador, denominador * t.numerador)
  }
}
