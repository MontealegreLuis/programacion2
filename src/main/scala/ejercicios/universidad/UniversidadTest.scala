package ejercicios.universidad
import com.github.nscala_time.time.Imports._
object Universidad extends App{
    var res : Int = 0
    var respuesta : Boolean = true
    var opcion : Int = 0
    val alumnos = new Alumnos()
    val profesores = new Profesores()
    val asignaturas = new Asignaturas()
    val departamentos = new Departamentos()
    respuesta = true
    while(respuesta == true){
      println("[1] Agregar alumno \n")
      println("[2] Agregar profesor \n")
      println("[3] Agregar asignatura \n")
      println("[4] Agregar Departamento \n")
      println("[5] Agregar seccion \n")
      println("[6] Inscribir alumno \n")
      println("[7] Calificar alumno \n")
      println("[8] Historial academico \n")
      println("[9] Agregar proyecto \n")
      println("[10] Agregar profesor a proyecto \n")
      println("[11] Agregar becario a proyecto \n")
      println("[12] Buscar proyecto por codigo \n")
      println("[13] Salir \n")
      println("\n Ingresa el número de la opción que deseas: \n")
      opcion = readInt()
      opcion match{
        case 1 =>println("\n Agregar alumno \n")
                var res2 = 0
                var sino:Boolean = true
                while(sino == true || alumnos.total() < 20 ){
                  println("\n Nombre: \n")
                  var nombre=readLine()
                  println("\n Numero de Seguro Social: \n")
                  var numSegSocial=readLine()
                  println("\n Direccion: \n")
                  var direccion=readLine()
                  println("\n Sexo [M / F] \n")
                  var sexo=readChar()
                  println("\n fecha de nacimiento \n")
                  println("\n Dia: \n")
                  var dia = readInt()
                  println("\n Mes: \n")
                  var mes = readInt()
                  println("\n Año \n")
                  var anio = readInt()
                  var fechaNacimiento = new DateTime(anio,mes,dia,0,0)
                  printf("\n Carrera: \n")
                  var carrera = readLine()
                  printf("\n Matricula: \n")
                  var matricula=readLine()
                  val alumno = new Alumno(nombre,numSegSocial,direccion,sexo,fechaNacimiento,carrera,matricula)
                  alumnos.agregar(alumno)
                  if(alumnos.total() >= 20){
                    println("\n ya no se pueden ingresar mas alumnos \n")
                  }else{

                  }
                  printf("\n desea capturar datos de otro alumno? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                    sino = true
                  }else{
                    sino = false
                  }
                }
        case 2 =>println("\n Agregar profesor \n")
                var res2 = 0
                var sino:Boolean = true
                while(sino == true || profesores.total() < 20 ){
                  println("\n Nombre: \n")
                  var nombre=readLine()
                  println("\n Numero de Seguro Social: \n")
                  var numSegSocial=readLine()
                  println("\n Direccion: \n")
                  var direccion=readLine()
                  println("\n Sexo [M / F] \n")
                  var sexo=readChar()
                  println("\n fecha de nacimiento \n")
                  println("\n Dia: \n")
                  var dia = readInt()
                  println("\n Mes: \n")
                  var mes = readInt()
                  println("\n Año \n")
                  var anio = readInt()
                  var fechaNacimiento = new DateTime(anio,mes,dia,0,0)
                  println("\n Carrera: \n")
                  var carrera = readLine()
                  println("\n Categoria [HC / TC / MT] \n")
                  var categoria = readLine()
                  println("\n Despacho: \n")
                  var despacho = readInt()
                  println("\n Extencion: \n")
                  var extencion = readInt()
                  println("\n Salario: \n")
                  var salario = readFloat()
                  val profesor = new Profesor(nombre,numSegSocial,direccion,sexo,fechaNacimiento,carrera,categoria,despacho,extencion,salario)
                  profesores.agregar(profesor)
                  if(profesores.total() >= 20){
                    println("\n ya no se pueden ingresar mas profesores \n")
                  }
                  printf("\n desea capturar datos de otro profesor? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                    sino = true
                  }else{
                    sino = false
                  }
                }
        case 3 =>println("\n Agregar asignatura \n")
                var res2 = 0
                var sino:Boolean = true
                var asig : Array[Asignatura]
                var depto : Int = 0
                while(sino == true || asignaturasS.total() < 20 ){
                  println("\n Nombre: \n")
                  var nombre=readLine()
                  println("\n Codigo: \n")
                  var codigo=readLine()
                  println("\n Descripcion: \n")
                  var descripcion=readLine()
                  println("\n Carrera \n")
                  var carrera = readLine()
                  val departamentosDeLaCarrera = deparamentos.deLaCarrera(carrera)
                  println("\n Departamento \n")
                  for(i <- 0 to departamentosDeLaCarrera.length){
                    println(" [ " i+1 + " ] " + departamentosDeLaCarrera(i).nombre)
                  }
                  val seleccionado = readInt()
                  val departamento = departamentosDeLaCarrera(seleccionado)
                  val asignatura = new Asignatura(nombre,codigo,descripcion,departamento)
                  asignaturas.agregar(asignatura)
                  if(asignaturas.total() >= 20){
                    println("\n ya no se pueden ingresar mas profesores \n")
                  }
                  printf("\n desea capturar datos de otro profesor? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                    sino = true
                  }else{
                    sino = false
                  }
                } 
        case 4 => println("\n Agregar departamento \n")
                  var res2 = 0
                  var sino:Boolean = true
                  var asig : Array[Asignatura]
                  var depto : Int = 0
                  while(sino == true || asignaturasS.total() < 20 ){
                    println("\n Nombre: \n")
                    var nombre = readLine()
                    println("\n Telefono: \n")
                    var telefono = readLine()
                    println("\n Carrera: \n")
                    var carrera = readLine()
                    val profesoresDeLaCarrera = profesores.deLaCarrera(carrera)
                    println("\n Director: \n")
                    for(i <- 0 to profesoresDeLaCarrera.length){
                      println(" [ " i+1 + " ] " + profesoresDeLaCarrera(i).nombre)
                    }
                    val seleccionado = readInt()
                    val director = profesoresDeLaCarrera(seleccionado)
                    val departamento = new Departamento(nombre,telefono,director)
                    deparamentos.agregar(departamento)
                  }
        case 5 => println("\n Agregar seccion \n")
                  var res2 = 0
                  var sino:Boolean = true
                  var asig : Array[Asignatura]
                  var depto : Int = 0
                  while(sino == true || asignaturasS.total() < 20 ){
                    println("\n Carrera: \n")
                    var carrera = readLine()
                    println("\n Grupo: \n")
                    var grupo = readInt()
                    println("\n Cuatrimestre (Primavera/Verano/Otoño): \n")
                    var cuatrimestre = readLine()
                    println("\n Año: \n")
                    var anio = readInt()
                    val asignaturasDeLaCarrrear = Asignaturas.deLaCarrera(carrera)
                    println("\n Asignatura: \n")
                    for(i <- 0 to asignaturasDeLaCarrera.length){
                      println(" [ " i+1 + " ] " + asignaturasDeLaCarrera(i).nombre)
                    }
                    val seleccionado = readInt()
                    val asignatura = asignaturasDeLaCarrera(seleccionado)
                    val profesoresDeLaCarrera = profesores.deLaCarrera(carrera)
                    println("\n Profesor: \n")
                    for(i <- 0 to profesoresDeLaCarrera.length){
                      println(" [ " i+1 + " ] " + profesoresDeLaCarrera(i).nombre)
                    }
                    val seleccionado = readInt()
                    val profesor = profesoresDeLaCarrera(seleccionado)
                    val seccion = new Seccion(asignatura,grupo,profesor,cuatrimestre,anio)
                    secciones.agregar(seccion)
                  }        
    }//finSwitch
  }//FinWhilePrincipal
}//finMain