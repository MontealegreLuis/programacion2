class Vendedor (a: String, b: String, c: String, d: Int, e:Int, f:Int)extends Persona(a,b,c,d) {
 
 val NSS:Int=e
 var Ventas:Int =f
 
 def Persona(a: String, b: String, c: String, d: Int, e:Int, f:Int):Vendedor={
   new Vendedor (DNI, Nombre,  Direccion,  Telefono, this.NSS, this.Ventas)
   
   
 }
 
 
}