class Nuevo (a:String,b:String, c:Int)extends Automovil (a,b){
  val Costo:Int=c
  def Nuevo(a:String,b:String, c:Int): Nuevo ={
    new Nuevo (Color, Matricula, this.Costo)
  }
  
}