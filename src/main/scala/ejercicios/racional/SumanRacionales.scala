object SumanRacionales{
  def main(args: Array[String]){
      var num:Int = 0
      println("ingrese el numerador del primer numero racional \n")
      num=readInt()
      var den:Int = 0
      println("ingrese el denominador del primer numero racional \n")
      den = readInt()
      val rational = new Rational(num,den)
      num = 0
      den = 0
      println("ingrese el numerador del segundo numero racional \n")
      num=readInt()
      println("ingrese el denominador del segundo numero racional \n")
      den = readInt()
      val  rational2 = new Rational(num,den)
      var suma = rational.add(rational2)
      println("el resultado de la suma es :" + suma.numerador + "/" + suma.denominador )
  }
}
