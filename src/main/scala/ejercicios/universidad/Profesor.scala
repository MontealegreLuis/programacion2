package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Profesor(val nom:String,val segSocial:String,val dir:String,val sex:Char,val fechaNac:DateTime,val car:String,val categoria:String,val despacho:Int,val extencion:Int,val salario:Float) extends Persona(nom,segSocial,dir,sex,fechaNac,car){
  var departamento : Departamento
  def asignarADepartamento(depto:Departamento){
    this.departamento = depto
  }
}
