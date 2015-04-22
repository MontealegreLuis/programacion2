import scala.util.control._
import com.github.nscala_time.time.Imports._

object Universidad
{


  def menu(): Int = {
    println("          Menu        ")
    println("[1]  Agregar alumno")
    println("[2]  Agregar profesor")
    println("[3]  Agregar asignatura")
    println("[4]  Agregar departamento")
    println("[5]  Agregar seccion")
    println("[6]  Inscribir alumno")
    println("[7]  Calificar alumno")
    println("[8]  Historial academico")
    println("[9]  Agregar proyecto")
    println("[10] Agregar profesor a proyecto")
    println("[11] Agregar becario a proyecto")
    println("[12] Buscar proyecto por codigo")
    println("[13] Salir")
    println("Ingresa el numero de la opcion que desea:")
    return readInt()
  }

  def main(args: Array[String])
  {

     val loop = new Breaks;
     var m = 0

     val alumnos = new Alumnos();
     val profesores = new Profesores();
     val asignaturas = new Asignaturas();
     val departamentos = new Departamentos();
     val secciones = new Secciones();
     val proyectos = new Proyectos();

     do {

       m = menu();

         m match
          {
           case 1 => println("Nombre:")
                     val nombre = readLine()
                     println("N. de seguro social:")
                     val numeroSeguroSocial = readLine()
                     println("Direccion:")
                     val direccion = readLine()
                     println("Sexo (M/F):")
                     val sexo  = readChar()
                     println("Fecha de nacimiento:")
                     println("Dia:")
                     val d = readInt()
                     println("Mes:")
                     val m = readInt()
                     println("Anio:")
                     val a = readInt()
                     println("Carrera:")
                     val carrera = readLine()
                     println("Matricula:")
                     val matr = readLine()
                     val fechaNacimiento = new DateTime(a,m,d,0,0)
                     val alumno =  new Alumno(nombre, numeroSeguroSocial, direccion, sexo, fechaNacimiento, carrera, matr)
                     alumnos.agregar(alumno);
                     println("\033[1J")

           case 2 => println("Nombre:")
                     val nombre = readLine()
                     println("N. de seguro social:")
                     val numeroSeguroSocial = readLine()
                     println("Direccion :")
                     val direccion = readLine()
                     println("sexo (M/F) :")
                     val sexo  = readChar()
                     println("Fecha de nacimiento:")
                     println("Dia ")
                     val d = readInt()
                     println("Mes")
                     val m = readInt()
                     println("Anio")
                     val a = readInt()
                     println("Carrera: ")
                     val carrera = readLine()
                     println("Categoria (HC,TC,MT):")
                     val categoria = readLine()
                     println("Despacho:")
                     val despacho = readInt()
                     println("Extencion:")
                     val extencion = readInt()
                     println("Salario mensual")
                     val salario = readFloat()
                     val fechaNacimiento = new DateTime(a,m,d,0,0)
                     val profesor =  new Profesor(nombre, numeroSeguroSocial, direccion, sexo, fechaNacimiento, carrera, categoria, despacho, extencion, salario)
                     profesores.agregar(profesor);
                     println("\033[2J")

          case 3 => println("Nombre:")
                    val nombre = readLine()
                    println("Codigo:")
                    val codigo = readLine()
                    println("Descripcion:")
                    val descripcion = readLine()
                    println("Carrera:")
                    val carrera = readLine()
                    println("Departamentos:")
                    val dep = departamentos.deLaCarrera(carrera);
                    var auxindex = 1;
                    for ( x <- dep )
                    {
                    println("["+auxindex+"] "+x.getNombre())
                    auxindex = auxindex + 1
                    }
                    val result = readInt()
                    val asignatura = new Asignatura(nombre, codigo, descripcion, dep(result-1), carrera)
                    asignaturas.agregar(asignatura)
                    println("\033[2J")

          case 4 => println("Nombre:")
                    val nombre = readLine()
                    println("Telefono:")
                    val telefono = readInt()
                    println("Carrera:")
                    val carrera = readLine()
                    println("Director:")
                    val prof = profesores.deLaCarrera(carrera)
                    var auxindex = 1
                    for ( x <- prof)
                    {
                    println("["+auxindex+"] "+x.nombre())
                    auxindex = auxindex + 1
                    }
                    val result = readInt()
                    val departamento = new Departamento(nombre, telefono, carrera, prof(result-1) )
                    departamentos.agregar(departamento)

          case 5 => println("Carera:")
                    val carrera = readLine()
                    println("Grupo:")
                    val grupo = readInt()
                    println("Cuatrimestre (Primavera/Verano/Otoño):")
                    val cuatrimestre = readLine()
                    println("Anio:")
                    val anio = readInt()
                    println("Asignatura:")
                    val asig = asignaturas.deLaCarrera(carrera)
                    var auxindex_1 = 1
                    for ( x <- asig)
                    {
                    println("["+auxindex_1+"] "+x)
                    auxindex_1 = auxindex_1 + 1
                    }
                    var result_1 = readInt()
                    println("Profesor:")
                    val prof = profesores.deLaCarrera(carrera)
                    var auxindex_2 = 1
                    for ( x <- prof)
                    {
                    println("["+auxindex_2+"] "+x.nombre())
                    auxindex_2 = auxindex_2 + 1
                    }
                    val result_2 = readInt()
                    val seccion = new Seccion(grupo, cuatrimestre, anio, asig(result_1-1), prof(result_2-1))
                    secciones.agregar(seccion)
                    println("\033[2J")

          case 6  => println("Carera:")
                     val carrera = readLine()
                     println("Cuatrimestre (Primavera/Verano/Otoño):")
                     val cuatrimestre = readLine()
                     println("Anio:")
                     val anio = readInt()
                     println("Seccion:")
                     val secc = secciones.queCoincidanCon(carrera, cuatrimestre, anio)
                     var auxindex = 1
                     for ( x <- secc)
                     {
                     println("["+auxindex+"] "+x.nombre())
                     auxindex = auxindex + 1
                     }
                     val result = readInt()

           case 7 => println("Matricula:")
                     val matricula = readLine()
                     println("Materia:")
                     val alum = alumnos.conMatricula(matricula)
                     val mat = alum.getMaterias()
                     var auxindex = 1
                     for ( x <- mat)
                     {
                     println("["+auxindex+"] "+x.materia())
                     auxindex = auxindex + 1
                     }
                     val result = readInt()
                     println("Calificacion: ")
                     val calif = readFloat()
                     alumnos.calificar(alum, mat(result-1) , calif);
                     println("\033[2J")

          case 8 => println("Matricula:")
                    val matricula = readLine()
                    val alum = alumnos.conMatricula(matricula)
                    val histo = alum.getHistorial()
                    for (x <- histo)
                    {
                    println(x)
                    }
                    println("\033[2J")

          case 9 => println("Carrera:")
                    val carrera = readLine()
                    println("Nombre:")
                    val nombre = readLine()
                    println("Codigo:")
                    val codigo = readLine()
                    println("Fecha de inicio:")
                    println("Dia:")
                    val d = readInt()
                    println("Mes:")
                    val m = readInt()
                    println("Anio:")
                    val a = readInt()
                    println("Subvencion $:")
                    val subvencion = readFloat()
                    println("Institucion:")
                    val institucion =  readLine()
                    println("Investigador:")
                    val prof = profesores.deLaCarrera(carrera)
                    val fechaInicio = new DateTime(a,m,d,0,0)
                    var auxindex = 1
                    for ( x <- prof)
                    {
                    println("["+auxindex+"] "+x.nombre())
                    auxindex = auxindex + 1
                    }
                    val result = readInt()
                    val proyecto = new Proyecto(nombre, codigo, fechaInicio, subvencion, institucion, carrera, prof(result-1) );
                    proyectos.agregar(proyecto)
                    println("\033[2J")

         case 10 => println("Codigo:")
                    val codigo = readLine()
                    val proyecto = proyectos.conCodigo(codigo);
                    val prof = profesores.deLaCarrera(proyecto.carrera())
                    println("Profesor:")
                    var auxindex = 1
                    for ( x <- prof)
                    {
                    println("["+auxindex+"] "+x.nombre())
                    auxindex = auxindex + 1
                    }
                    val result = readInt()
                    proyecto.agregarProfesor(prof(result-1))
                    println("\033[2J")

         case 11 => println("Codigo:")
                    val codigo = readLine()
                    val proyecto = proyectos.conCodigo(codigo);
                    val alum = alumnos.deLaCarrera(proyecto.carrera())
                    println("Becario:")
                    var auxindex = 1
                    for ( x <- alum)
                    {
                    println("["+auxindex+"] "+x.nombre())
                    auxindex = auxindex + 1
                    }
                    val result = readInt()
                    proyecto.agregarBecario(alum(result-1))
                    println("\033[2J")

         case 12 => println("Codigo:")
                    val codigo = readLine()
                    val proyecto = proyectos.conCodigo(codigo);
                    println("Nombre: "+proyecto.nombre())
                    println("Carrera: "+proyecto.carrera())
                    println("Fecha de Inicio: "+proyecto.fechaInicio().toString())
                    println("Subvencion: "+proyecto.subvencion())
                    println("Institucion: "+proyecto.institucion())
                    println("Investigador: "+proyecto.investigador())
                    println("Profesores:")
                    for(x <- proyecto.profesores())
                       println(x.nombre())
                       println("Becarios")
                    for(x <- proyecto.becarios())
                       println(x.nombre())

         case 13 => println("Fin de el Programa");

         case _ => println("Error")
      }

      }while( m != 13);

    }

}
