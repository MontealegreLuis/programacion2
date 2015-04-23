object Concecionaria {

  def menu(): Int = {

    println("          Menu        ")
    println("[1]  Agregar vehiculos")
    println("[2]  buscar vehiculos por modelos (nombre)")
    println("[3]  buscar vehiculos por precio")
    println("[4]  vender un vehiculo")
    println("[5]  Agregar clientes")
    println("[7]  salir")
    println("ingresa el numero de la opcion que desea:")

    return readInt()
  }
  def main(args: Array[String])
  {
     var m = 0
     val autos = new Autos();
     val ventadeautos = new VentaDeAutos();
do{
   var m = menu();

   m match
   {
     case 1 =>

            println("deme nombre:")
            val nombre = readLine()
            println("deme matricula:")
            val matricula = readLine()
            println("color:")
            val color = readLine()
            println("modelo:")
            val modelo = readInt()
            println("deme el precio")
            val precio = readFloat()

           val auto = new Auto(nombre,matricula,color,modelo,precio)

           autos.agregar(auto)

     case 2 =>

           println("deme modelo:")
           val modelo = readInt()
           val au = autos.deLaConcesionaria(modelo)
           var auxindex = 1
      for(x <- au)
          {

            println("["+auxindex+"]"+ x.nombr())
            auxindex = auxindex + 1
          }


    case 3 =>

          println("deme el precio:")
          val precio = readFloat()
          val au = autos.delPrecio(precio)
          var auxindex = 1
     for(x <- au)
        {

          println("["+auxindex+"]"+ x.nombr())
          auxindex = auxindex + 1
        }

       //vender vehiculo

    case 4 =>


          println("deme fecha")
          val fecha = readLine()
          println("deme precio final")
          val precio = readFloat()
          println("deme modelo:")
          val modelo = readInt()

          val au = autos.deLaConcesionaria(modelo)
          var auxindex = 1
    for(x <- au)
          {

          println("["+auxindex+"]"+ x.nombr())
          auxindex = auxindex + 1
          }

         val result = readInt()

         val ventadeauto = new VentaDeAuto(fecha,precio,au(result-1))
         ventadeautos.agregar(ventadeauto)
    case 5 =>

         println("Nombre del cliente")
         val cliente = readLine()
         println("direccion")
         val direccion = readLine()
         println("telefono")
         val telefono = readLine()
         println("vehiculo comprado")


     }
    }while(m != 7);

   }

}
