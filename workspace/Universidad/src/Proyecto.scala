class Proyecto (
    val Nomre_proy:String, 
    val Codigo_proy:Int, 
    val Fecha_ini:String, 
    val Costo_proy:Int, 
    val Entidad:String,
    val Director_proy:String, 
    val listpart:Int){

  def this(){
    this ("",0,"",0,"","",0 )
  }
  
  
  
}/*Proyectos de investigación realizados por el 
profesorado y becarios. 
Para cada uno se guarda su nombre, código, fecha de inicio, 
subvención obtenida (ayuda económica), entidad que subvenciona,
*  investigador principal (profesor) y profesores y 
*  becarios participantes.*/
