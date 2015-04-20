package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Alumnos{
  val alumnos = new Array[Alumno](20)
  var cont=0
  var contAlum = 0
  def agregar(alumno:Alumno){
    alumnos(cont) = alumno
    cont++
  }
  def conMatricula(mat : String):Alumno ={
    for(i <- 0 to alumnos.length){
      if(alumnos(i).matricula() == mat){
        val alumno = alumnos(i)
        contAlum ++
      }
    }
    return alumno
  }
  def total():Int={
    this.cont
  }
  def totalAlum():Int={
    contAlum
  }
  def deLaCarrera(carrera : String):Array[Alumno]={
    val alums = new Departamentos()
    var con = 0
    for(i <- 0 to alumnos.length){
      if(alumnos(i).carrera == carrera){
        alums(i)=alumnos(i)
        con ++
      }
    }
    return alums
  }
}
