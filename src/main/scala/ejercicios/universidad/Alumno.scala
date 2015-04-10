package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Alumno(val nom:String,val numSeguroSocial:String,val dir:String,val sex:Char,val fechaNac:DateTime)extends Persona(nom,numSeguroSocial,dir,sex,fechaNac,car){
  val matricula:String
  val carrera:String
  def matricula():String{
  }
}
