import Array._
object Concesion {
  def main(args:Array[String]){
    
    println ("Concesionaria Uxiel")
    println ("Autos nuevos unicamente")
    println ("Tomamos tu auto usado a cuenta")
    
   var menugrande :Int=0
   var menupeq :Int=0
   var listvend = new Array[Vendedor](100)
   var contvend=0
   var listclient = new Array[Cliente](100)
   var contclient=0
   var contop=0
   var listop = new Array[Opcion_Modelo](100)
   var contmod=0
   var listmod = new Array[Modelo](100)
   var contauton=0
   var listauton = new Array[Nuevo](100)
   var listauxn= Array.ofDim[Int](2,100) 
   var contautou=0
   var listautou = new Array[Usado](100)
   var listauxu= Array.ofDim[Int](2,100) 
   var x, y, z:String=""
   var i,j,k:Int=0
   var listvendidos=new Array[Vendidos](100)
   var contvendidos=0
   
   
    do{
    println ("Escoja una opcion")
    println ("1     Vendedor")
    println ("2     Cliente")
    println ("3     Opciones de autos")
    println ("4    Vender un auto")
    println ("0     Salir")
    menugrande=readInt()
    menugrande match {
            case 1  => /*VENDEDORES*/
                  do {
                  println ("Escoja una opcion")
                  println ("1     Registrar un Vendedor")
                  println ("2     Mostrar lista de Vendedores")
                  println ("0     Salir")
                  menupeq=readInt
                  menupeq match{
                    case 1  => 
                      println ("Registrar un Vendedor")
                      println("Introduzca DNI")
                      var DNI=readLine 
                      println("Introduzca Nombre")
                      var Nomb=readLine 
                      println("Introduzca Direccion")
                      var Dir=readLine
                      println("Introduzca Telefono")
                      var Tel=readInt 
                      println("Introduzca Numero Seguro Social")
                      var Nss=readInt
                      println("Vendedores nuevos no tienen ventas registradas")
                      var Vents=0
                      listvend(contvend)=new Vendedor (DNI,Nomb,Dir,Tel,Nss,Vents)
                      contvend +=1
                      if (listvend(contvend).Nombre =="Aquilesba Hiloyo") println ("No jodas")
                    case 2  => 
                      if (contvend==0) println ("No es posible mostrar vendedores porque no hay ninguno registrado")
                      else for (i <- 0 to contvend) println ("\nVendedor " + i + listvend(i))
                    case 3  =>null
                    case default=> println("Unexpected case")
                  }
                  }while (menupeq<0&&menupeq>3)  
                  
            
            case 2  => /*CLIENTES*/
                  do {
                  println ("Escoja una opcion")
                  println ("1     Registrar un Cliente")
                  println ("2     Mostrar lista de Clientes")
                  println ("0     Salir")
                  menupeq=readInt
                  menupeq match{
                    case 1  => 
                      println ("Registrar un Cliente")
                      println("Introduzca DNI")
                      var DNI=readLine 
                      println("Introduzca Nombre")
                      var Nomb=readLine 
                      println("Introduzca Direccion")
                      var Dir=readLine
                      println("Introduzca Telefono")
                      var Tel=readInt 
                      listclient(contclient)=new Cliente (DNI,Nomb,Dir,Tel)
                      contclient +=1
                    case 2  => 
                      if (contclient==0) println ("No es posible mostrar clientes porque no hay ninguno registrado")
                      else for (i <- 0 to contclient) println ("\nCliente " + i + listclient(i))
                    case 3  =>null
                    case default=> println("Unexpected case")
                  }
                  }while (menupeq<0&&menupeq>3) 
            case 3  => 
              
                  do {
                  println ("Escoja una opcion")
                  println ("1     Registrar una opcion")
                  println ("2     Registrar un modelo") 
                  println ("3     Registrar un auto nuevo") 
                  println ("4     Registrar un auto usado")
                  println ("5     Mostrar modelos registradas")
                  println ("6     Mostrar opciones registrados")
                  println ("7     Mostrar autos nuevos")
                  println ("0     Salir")
                  menupeq=readInt
                  menupeq match{
                    case 1 => /*OPCIONES*/
                      println ("Como se llama la opcion " + contop+1)
                      var n=readLine
                      println ("Proporciona la descripcion del modelo")
                      var d=readLine
                      println ("Cual es el valor de esta opcion ")
                      var co=readInt
                      listop(contop)=new Opcion_Modelo (n,d,co)
                     
                    case 2  => /*MODELO*/
                      println ("Cual es la marca")
                      var n=readLine
                      println ("Proporciona el modelo(año)")
                      var d=readInt
                      println ("Cual es la cilindrada")
                      var co=readInt
                      listmod(contmod)=new Modelo (n,d,co)
                     
                    case 3 =>/*AUTO NUEVO*/
                      if (contmod==0&&contop==0) println ("No se puede registrar un auto sin tener modelos u opciones disponibles")
                      else {
                          println ("Cual es el color")
                          var col=readLine
                          println ("Proporciona la matricula")
                          var mat=readLine
                          println ("Cual es el costo base")
                          var cost=readInt
                          println("Numero de modelo")
                          var numod=readInt
                          println("Numero de la opcion del modelo")
                          var numop=readInt
                          listauton(contauton)=new Nuevo (col,mat,cost)
                          listauxn(contauton)(contauton)=(numop) 
                          listauxn(contauton)(contauton+1)=(numod)}
                    case 4 => /*Auto USADO*/
                      if (contmod==0&&contop==0) println ("No se puede registrar un auto sin tener modelos u opciones disponibles")
                      else {
                          println ("Cual es el color")
                          var col=readLine
                          println ("Proporciona la matricula")
                          var mat=readLine
                          println ("Cual es el kilometraje")
                          var kilom=readInt
                          println ("Cual es el costo del behiculo usado")
                          var cost=readInt
                          println("Numero de modelo")
                          var numod=readInt
                          println("Numero de la opcion del modelo")
                          var numop=readInt
                          listautou(contauton)=new Usado (col,mat,kilom,cost)
                          listauxu(contautou)(contautou)=(numop) 
                          listauxu(contautou)(contautou+1)=(numod)}
                    case 5 =>
                       if (contmod==0&&contop==0) println ("No se puede mostrar los registros de modelos sin tener modelos disponibles")
                      else{
                        for (i <- 0 to contmod) println ("\nModelo # " + i + "= " +listmod(i))
                      }
                     case 6 =>
                       if (contmod==0&&contop==0) println ("No se puede mostrar los registros de opciones sin tener opciones disponibles")
                      else{
                        for (i <- 0 to contop) println ("\nOpcion # " + i + "= " +listop(i))
                          }
                     case 7 =>
                       if (contmod==0&&contop==0) println ("No se puede mostrar los registros de autos sin tener autos disponibles")
                      else{
                        for (i <- 0 to contauton) println ("\nAuto # " + i + "= " +listauton(i) + "Modelo " +listauxn(i)(i+1)+ "Opcion " +listauxn(i)(i))
                          }
                     case 0 => null
                     case default=> println("Unexpected case")
                     }
                   }while (menupeq<0&&menupeq>8)     
            case 4  => 
              if (contmod==0&&contop==0) println ("No se puede vender un auto sin tener autos/opciones/modelos disponibles")
                      else{
                        println("Se dejara un auto usado a cuent?" )
                        println("1=si")
                        println("0=No")
                        var auxvent=readInt
                        if (auxvent==0){
                          println ("Introduzca el numero del auto que se va a vender")
                          var auxvent2= readInt
                          println ("El auto tiene un coste  base de"+ listauton(auxvent2).Costo + " \nModelo = " +listauxn(auxvent2)(auxvent2+1) + " \nCon la opcion "+listauxn(auxvent2)(auxvent2))
                          var auxvent3 = listop(auxvent2).Costo_Opcion + listauton(auxvent2).Costo
                          println("El precio total del auto es " + auxvent3)
                          println("Introduzca numero de vendedor")
                          var numvend=readInt
                          println("Introduzca numero de cliente")
                          var numclien=readInt
                          listvendidos(contvendidos)= new Vendidos (auxvent2, numvend,numclien)
                          listvend(numvend).Ventas= listvend(numvend).Ventas+auxvent3
                          }
                        else {
                          if (auxvent==1){
                            println ("Introduzca el numero del auto que se va a vender")
                            var auxvent2= readInt
                            println("Introduzca numero de auto usado que se deja a cuenta")
                            var auxusad=readInt
                            println ("El auto tiene un coste  base de"+ listauton(auxvent2).Costo + " \nModelo = " +listauxn(auxvent2)(auxvent2+1) + " \nCon la opcion "+listauxn(auxvent2)(auxvent2))
                            println ("El descuento por el auto a cuenta es de "+listautou(auxvent2).Valor)
                            var auxvent3 = listop(auxvent2).Costo_Opcion + listauton(auxvent2).Costo-listautou(auxvent2).Valor
                            println("El precio total del auto es " + auxvent3)
                            println("Introduzca numero de vendedor")
                            var numvend=readInt
                            println("Introduzca numero de cliente")
                            var numclien=readInt
                            listvendidos(contvendidos)= new Vendidos (auxvent2, numvend,numclien)
                            listvend(numvend).Ventas= listvend(numvend).Ventas+auxvent3
                           }
                        }
                        
                      }
              
            case default  => println("Unexpected case")
        
    }
      }while (menugrande<0&&menugrande>5)
}
}

/*i is an integer
var i= match {
  case 1  => println("January")
  case 2  => println("February")
  case 3  => println("March")
  case 4  => println("April")
  case 5  => println("May")
  case 6  => println("June")
  case 7  => println("July")
  case 8  => println("August")
  case 9  => println("September")
  case 10 => println("October")
  case 11 => println("November")
  case 12 => println("December")
  // catch the default with a variable so you can print it
  case whoa  => println("Unexpected case: " + whoa.toString)*/