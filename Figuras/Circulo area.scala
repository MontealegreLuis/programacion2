class Circulo extends Figura {
    def area: Float =  {

      println("deme el radio del circulo")
      var r = readFloat()

      var pi: Duble = 3.1415
      var a = 0
      var p = 0
      p = r*r
      a= pi*p

      println(a)

    }
}
