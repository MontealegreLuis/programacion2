object FiguraTest{
  def main(args:Array[String]){
    var opcion:Int = 0
    var a:Double = 0.0
    println("\n de que figura desea calcular su area \n")
    println("1.>> Circulo\t2.>> Rectangulo")
    opcion = readInt()
    if(opcion == 1){
      println("\n ingrese el radio del circulo \n")
      var r = readDouble()
      val circulo = new Circulo(r)
      a=circulo.getArea()
      println("\n el area del circulo es " + a)
    }else if(opcion == 2){
      println("\n ingrese la altura del rectangulo \n")
      var l = readDouble()
      println("\n ingrese la base del rectangulo \n")
      var w = readDouble()
      val rectangulo = new Rectangulo(l,w)
      var a = rectangulo.getArea()
      println("\n el area del rectangulo es " + a)
    }
  }
}
