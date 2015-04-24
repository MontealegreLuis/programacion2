import scala.util.control._
import com.github.nscala_time.time.Imports._
object Universidad
{
  def main(args: Array[String])
  {
   val loop = new Breaks;
    val op = 0
    val x = 0


   do {

     println("Opciones")
     println("[1] Agregar alumno")
     println("[2] Agregar profesor")
     println("[3] Registrar asignatura")
     println("[4] Registrar departamento")
     println("[5] Registrar seccion")
     println("[6] Inscribir alumno")
     println("[7] Calificar alumno")
     println("[8] Historial academico")
     println("[9]  Agregar proyecto")
     println("[10] Agregar profesor a proyecto")
     println("[11] Agregar becario a proyecto")
     println("[12] Buscar proyecto por codigo")
     println("[13] Salir")

     println("Ingresa el numero de la opcion que desea:")
     val op = readInt()

   op match
    {
     case 1 =>
     println("Numero de alumnos a ingresar")
     val t = readInt()
     val total = new Alumnos(t)
  for(i <- 0 to t-1)
   {
     println("Nombre del alumno:"+i)
     val nombre = readLine()
     println("N. de Seguro Social:"+i)
     val numerodeSeguroSocial = readLine()
     println("Direccion :"+i)
     val direccion = readLine()
     println("Seleccionar Sexo (M/F) :"+i)
     val sexo  = readChar()
     println("Ingresar Fecha de nacimiento:"+i)
     println("Ingresar dia ")
     val d = readInt
     println("Ingresar mes")
     val m = readInt
     println("Ingresar año")
     val a = readInt()
     println("Carrera: "+i)
     val carrera = readLine()
     println("Matricula: "+i)
     val matri = readInt()
     val fechadeNacimiento =  DateTime(d,m,a,0,0)
     val alumno =  new Alumno(nombre, numerodeSeguroSocial, direccion, sexo, fechadeNacimiento, carrera, matricula)

   }

     case 2 =>

     println("Numero de profesores a ingresar")
     val t = readInt()
     val total = new Alumnos(t)
  for(i <- 0 to t-1)
   {
     println("Nombre del Profesor:"+i)
     val nombre = readLine()
     println("N. de seguro social:"+i)
     val numerodeSeguroSocial = readLine()
     println("Direccion :"+i)
     val direccion = readLine()
     println("Seleccionar Sexo (M/F) :"+i)
     val sexo  = readChar()
     println("Ingresar Fecha de Nacimiento (aa-mm-dd) :"+i)
     println("Ingresar dia ")
     val d = readInt
     println("Ingresar mes")
     val m = readInt
     println("Ingresar año")
     val a = readInt()
     val fechaNacimiento = readLine()
     println("Carrera: "+i)
     val carrera = readLine()
     println("Matricula: "+i)
     val matricula = readLine()
     println("Ingresar la categoria (HC,TC,MT):")
     val categoria = readLine()
     println("Ingresar el numero de despacho")
     val despacho = readInt()
     println("Ingresar la extencion")
     val extencion = readInt()
     println("Ingresar el salario mensual")
     val salario = readFloat()
     val fechadeNacimiento =  DateTime(d,m,a,0,0)
     val profesor =  new Profesor(nombre, numerodeSeguroSocial, direccion, sexo, fechadeNacimiento, carrera, matricula, categoria, despacho, extencion, salario)
     }

     case 3 =>

      println("Ingresar numero de asignaturas:")
      val t = readInt()
      val total = new Asignaturas(t)
    for(i <- 0 to t-1)
    {
      println("Ingresar el nombre de la asignatura:")
      val nombre = readLine()
      println("Ingresar el codigo:")
      val codigo = readInt()
      println("Ingresar la descripsion:")
      val descripcion = readLine()
      println("Ingresar nombre de la carrera:")
      val carrera = readLine()
      println("Los departamentos de la carrera son:")
      val asignatura = new Asignatura(nombre, codigo, descripsion, carrera)

    }

    case 4 =>

    println("Ingresar numero de departamentos:")
    val t = readInt()
    val total = new Departamentos(t)
  for(i <- 0 to t-1)
  {
    println("Ingresar el nombre del departamento:")
    val nombre = readLine()
    println("Ingresar telefono:")
    val telefono = readInt()
    println("Ingresar nombre de la carrera:")
    val carrera = readLine()
    println("Ingresar el director:")
    val director = readLine()

    val departamento = new Departamento(nombre, telefono, carrera, director )
  }

   case 5 =>
   println("Ingresar numero de seccines")
   val t = readInt()
for(i <- 0 to t-1)
{
   println("Ingresar la carera")
   val carrera = readLine()
   println("Ingresar el grupo")
   val grupo = readInt()
   println("Elegir cutrimestre (primavera,verano,otoño)")
   val cuatrimestre = readLine()
   println("Ingresar el año")
   val an = readInt()
   println("Ingresar asignatura")
   val asignatur = readLine()
   println("Ingresar profesor")
   val profesor = readLine()

   val seccion = new Seccion(carrera, grupo, cuatrimestre, anio, asignatur, profesor)

 }

    case 6  =>

    println("Ingresar numero de seciones a inscribir")
    val t = readInt()
 for(i <- 0 to t-1)
 {
    println("Ingresar la carera")
    val carrera = readLine()
    println("Elegir cutrimestre (primavera,verano,otoño)")
    val cuatrimestre = readLine()
    println("Ingresar el año")
    val an = readInt()
    println("Ingresar seccion")
    val seccion = readLine()
}

  case 7 =>

  println("Ingresar matricula")
  val matricula = readInt()

  println("Ingresar materia")
  val materia = readLine()

  println("Calificacion: ")
  val calif = readFloat()


 case 8 =>

   println("Ingresar matricula")
   val matricula = readInt()


case 9 =>

    println("Ingresar la carrera")
    val carrera = readLine()
    println("Ingresar el nombre")
    val nombre = readLine()
    println("Ingresar codigo")
    val codigo = readInt
    println("Ingresar fecha de inicio")
    val fecha = readLine()
    println("Ingresar subvencion")
    val subvencion = readFloat()
    println("Ingresar institucion")
    val institucion =  readLine()
    println("Ingresar investigador")
    val investigador =  readLine()


case 10 =>
        println("Ingresar el codigo")
        val codigo = readInt()
        println("Ingresar profesor")
        val profesor = readLine()

case 11 =>

       println("Ingresar el codigo")
       val codigo =  readInt()
       println("Ingresar el becario")
       val profesor = readLine()

 case 12 =>

        println("Ingresar el codigo ")
        val codigo =  readInt()
}


   val x = op
}while( x != 13);

 }

}
