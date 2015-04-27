class Opcion_Modelo (NO:String, DO:String,CO:Int){
  val Nombre_Opcion:String=NO
  val Descripcion_Opcion:String=DO
  val Costo_Opcion:Int=0

    def Opcion_Modelo (NO:String,DO:String,CO:Int):Opcion_Modelo={
          new Opcion_Modelo (NO,DO,CO)
 }
}