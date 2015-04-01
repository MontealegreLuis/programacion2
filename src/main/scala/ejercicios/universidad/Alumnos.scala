class Alumnos{
  val alumnos:Array[Alumno](20)
  var cont=0
  def agregar(alumno:Alumno){
    alumnos(cont) = alumno
    cont++
  }
  def conMatricula(mat : String):Alumno:Alumno ={
    this.matricula = mat
  }
}
