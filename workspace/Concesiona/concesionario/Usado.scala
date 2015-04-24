class Usado (a:String,b:String, c:Int, d:Int)extends Automovil (a,b){
  val Kilometraje:Int =c
  val Valor: Int=d
  def Automovil (a:String,b:String, c:Int, d:Int): Usado = {
    new Usado (Color, Matricula, this.Kilometraje, this.Valor)
  }
}