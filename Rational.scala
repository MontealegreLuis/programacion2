object RationalTest{
    def main(args: Array[String]){
    var a = 0
    var b = 0
    var a1 = 0
    var b1 = 0

    println("Dame el numerador del primer racional")
    a = readInt()
    println("Dame su denominador")
    b = readInt()
    val r1 = new Rational(a, b)
    println("Dame el numerador del segundo racional")
    a1 = readInt()
    println("Dame su denominador")
    b1 = readInt()
    val r2 = new Rational(a1, b1)

    val r3 = r1.sumar(r2)

    println(r1.mostrar () + "+" + r2.mostrar ())
    println("la suma es " + r3.mostrar())

    val r4 = r1.restar(r2)

    println(r1.mostrar () + "-" + r2.mostrar ())
    println("la resta es " + r4.mostrar())

    val r5 = r1.multiplicar(r2)

    println(r1.mostrar () + "*" + r2.mostrar ())
    println("la multiplicacion es " + r5.mostrar())

    val r6 = r1.dividir(r2)

    println(r1.mostrar () + "/" + r2.mostrar ())
    println("la division  es " + r6.mostrar())




}



}
