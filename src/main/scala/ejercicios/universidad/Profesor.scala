package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Profesor(val nom:String,val segSocial:String,val dir:String,val sex:Char,val fechaNac:DateTime,val car:String,val categoria:String,val despacho:Int,val extencion:Int,val salario:Float) extends Persona(nom,segSocial,dir,sex,fechaNac,car){
  var departamento : Departamento
  def asignarADepartamento(depto:Departamento){
    this.departamento = depto
  }
  def nombre():String={
  	this.nombre
  }
  def mostrarDatos(){
  	println("Nombre: " + this.nom + " \n")
  	println("Seguro Social: " + this.segSocial + " \n")
  	println("Direccion: " + this.segSocial + " \n")
  	println("Sexo: " + this.sex  + " \n")
  	println("Fecha de Nacimiento:" + this.fechaNac  + " \n")
  	println("Carrera: " + this.car + " \n")
  	println("Categoria: " + this.categoria)
  	println("Despacho: " + this.despacho + " \n")
  	println("Extencion: " + this.extencion)
  	println("Salario: " + this.salario + " \n")
  }
}
