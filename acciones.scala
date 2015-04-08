object accionesTest{
  def main(args: Array[String]){
    val dog = new Perro()
    val car = new Coche()
    println ("soy un perro " + dog.mover() + "\n y ladro asi\n" + dog.hacerRuido())
    println ("soy un coche hago\n" + car.hacerRuido())
  }
}
