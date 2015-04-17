package tareas.universidad
class Asignatura(val nombre:String, 
               val codigo:Int, 
               val descripcion:Array[String], 
               val departamento:Departamento
               val carrera:String)
    extends Asignatura(nombre,codigo,descripcion,departamento){
}
