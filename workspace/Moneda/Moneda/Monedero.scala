class Monedero(val Saldo:Int) {

  def this (){
    this(0)
    }
  
  def meter (x: Monedero):Monedero ={
   var aux=0
   do{
     println("cantidad a ingresar")
     aux=readInt
   }while(aux<0)
    new Monedero(x.Saldo+aux)
  }
  
  def sacar (x: Monedero):Monedero ={
   var aux=0
   do{
     println("cantidad a retirar")
     aux=readInt
   }while(aux<x.Saldo)
    new Monedero(x.Saldo-aux)
  }
  
  
   override def toString: String = {
    return "%s".format("Saldo = " + Saldo)
  }
  
  
}