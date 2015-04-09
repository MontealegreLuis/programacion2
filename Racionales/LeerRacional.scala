object LeerRacional {
def main(args: Array[String]) {
    println("Numero de racionales a sumar")
    val m =  readInt()
    val f1 = new Racional(t)
    leerRacionales(f1)
    println(f1.mostrar())
    def leerRacionales(f: racional )
  {
    var continuar = 's'
    var denominador: Int = 0
    var numerador: Int = 0
    while(continuar == 's')
       {
            println("deme el denominador")
            denominador = readInt()
            println("deme el numerador")
            numerador =  readInt()
            f.agregarRacional(denominador , numerador)
            println("Decea agregar racional (s/n)")
            continuar = readChar()
         }
      }
   }
}
