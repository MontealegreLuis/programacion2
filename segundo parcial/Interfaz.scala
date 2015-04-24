object Interfaz{
	def main(args:Array[String]){	

		val Coche = new Coche()
		val Perro = new Perro()

		println("El coche:" + Coche.hacerruido() + "\nEl perro:" + Perro.mover() + " " + Perro.hacerruido())
}


}
