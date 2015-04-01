object MenuRacional{
  def main(args: Array[String]){
    var res : Int = 0
    var respuesta : Boolean = true
    var opcion : Int = 0
    respuesta = true
    while(respuesta == true){
      println("\n 1..Suma de fracciones \t 2..Resta de racionales \n")
      println("\n 3..Multiplicacion de racionales \t 4..Division de racionales \n")
      println("\n 5..Salir \n")
      opcion = readInt()
      opcion match{
        case 1 => println("\n\t suma de fracciones \n")
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
          println("\n el resultado de la suma es :" + suma.numerador + "/" + suma.denominador )
          println("\n desea hacer otra operacion ? 1.> Si\t2.> No \n")
          do{
            res = readInt()
            if (res != 1 && res != 2){
              println("\n error intente nuevamente\n")
            }else if(res == 1 || res == 2){
              if(res == 1){
                respuesta = true
              }else{
                respuesta = false
              }
            }
          }while(res != 1 && res != 2);
        case 2 => println("\n\t resta de fracciones \n")
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
          var resta = rational.subtrac(rational2)
          println("\n el resultado de la resta es :" + resta.numerador + "/" + resta.denominador )
          println("\n desea hacer otra operacion ? 1.> Si\t2.> No \n")
          do{
            res = readInt()
            if (res != 1 && res != 2){
              println("\n error intente nuevamente\n")
            }else if(res == 1 || res == 2){
              if(res == 1){
                respuesta = true
              }else{
                respuesta = false
              }
            }
          }while(res != 1 && res != 2);
        case 3 => println("\n\t multiplicacion de fracciones \n")
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
          var multiplica = rational.multiply(rational2)
          println("\n el resultado de la multiplicacion es :" + multiplica.numerador + "/" + multiplica.denominador )
          println("\n desea hacer otra operacion ? 1.> Si\t2.> No \n")
          do{
            res = readInt()
            if (res != 1 && res != 2){
              println("\n error intente nuevamente\n")
            }else if(res == 1 || res == 2){
              if(res == 1){
                respuesta = true
              }else{
                respuesta = false
              }
            }
          }while(res != 1 && res != 2);
        case 4 => println("\n\t division de fracciones \n")
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
          var division = rational.divide(rational2)
          println("\n el resultado de la division es :" + division.numerador + "/" + division.denominador )
          println("\n desea hacer otra operacion ? 1.> Si\t2.> No \n")
          do{
            res = readInt()
            if (res != 1 && res != 2){
              println("\n error intente nuevamente\n")
            }else if(res == 1 || res == 2){
              if(res == 1){
                respuesta = true
              }else{
                respuesta = false
              }
            }
          }while(res != 1 && res != 2);
      }
  }}
}
