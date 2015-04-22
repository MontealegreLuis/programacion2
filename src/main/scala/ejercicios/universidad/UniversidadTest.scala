package ejercicios.universidad
import com.github.nscala_time.time.Imports._
object Universidad extends App{
    var res : Int = 0
    var respuesta : Boolean = true
    var opcion : Int = 0
    val alumnos = new Alumnos()
    val profesores = new Profesores()
    val departamentos = new Departamentos()
    val secciones = new Secciones()
    val proyectos = new Proyectos()
    val notas = new HistorialAcademico()
    val asignaturas = new Asignaturas()
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
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
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
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 3 =>println("\n Agregar asignatura \n")
                var res2 = 0
                var sino:Boolean = true
                var depto : Int = 0
                while(sino == true || asignaturas.totalCon() < 20 ){
                  println("\n Nombre: \n")
                  var nombre=readLine()
                  println("\n Codigo: \n")
                  var codigo=readLine()
                  println("\n Descripcion: \n")
                  var descripcion=readLine()
                  println("\n Carrera \n")
                  var carrera = readLine()
                  val departamentosDeLaCarrera = departamentos.deLaCarrera(carrera)
                  println("\n Departamento \n")
                  for(i <- 0 to departamentosDeLaCarrera.length){
                    println(" [ " + i+1 + " ] " + departamentosDeLaCarrera(i).nombre)
                  }
                  val seleccionado = readInt()
                  val departamento = departamentosDeLaCarrera(seleccionado)
                  val asignatura = new Asignatura(nombre,codigo,descripcion,departamento)
                  asignaturas.agregar(asignatura)
                  if(asignaturas.totalCon() >= 20){
                    println("\n ya no se pueden ingresar mas asignaturas \n")
                  }
                  printf("\n desea capturar datos de otro asignatura? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                    sino = true
                  }else{
                    sino = false
                  }
                }
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 4 => println("\n Agregar departamento \n")
                  var res2 = 0
                  var sino:Boolean = true
                  var depto : Int = 0
                  while(sino == true || departamentos.total() < 20 ){
                    println("\n Nombre: \n")
                    var nombre = readLine()
                    println("\n Telefono: \n")
                    var telefono = readLine()
                    println("\n Carrera: \n")
                    var carrera = readLine()
                    val profesoresDeLaCarrera = profesores.deLaCarrera(carrera)
                    println("\n Director: \n")
                    for(i <- 0 to profesoresDeLaCarrera.length){
                      println(" [ " + i+1 + " ] " + profesoresDeLaCarrera(i).nombre)
                    }
                    val seleccionado = readInt()
                    val director = profesoresDeLaCarrera(seleccionado)
                    val departamento = new Departamento(nombre,telefono,director,carrera)
                    departamentos.agregar(departamento)
                    if(departamentos.total() >= 20){
                      println("\n ya no se pueden ingresar mas departamentos \n")
                    }
                    printf("\n desea capturar datos de otro departamento? 1.> Si\t2.>No")
                    res2 = readInt()
                    if(res2 == 1){
                     sino = true
                    }else{
                     sino = false
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 5 => println("\n Agregar seccion \n")
                  var res2 = 0
                  var sino:Boolean = true
                  var depto : Int = 0
                  while(sino == true || secciones.total() < 20 ){
                    println("\n Carrera: \n")
                    var carrera = readLine()
                    println("\n Grupo: \n")
                    var grupo = readInt()
                    println("\n Cuatrimestre (Primavera/Verano/Otoño): \n")
                    var cuatrimestre = readLine()
                    println("\n Año: \n")
                    var anio = readInt()
                    val asignaturasDeLaCarrera = asignaturas.deLaCarrera(carrera)
                    println("\n Asignatura: \n")
                    for(i <- 0 to asignaturasDeLaCarrera.length){
                      println(" [ " + i+1 + " ] " + asignaturasDeLaCarrera(i).nombre)
                    }
                    val seleccionado = readInt()
                    val asignatura = asignaturasDeLaCarrera(seleccionado)
                    val profesoresDeLaCarrera = profesores.deLaCarrera(carrera)
                    println("\n Profesor: \n")
                    for(i <- 0 to profesoresDeLaCarrera.length){
                      println(" [ " + i+1 + " ] " + profesoresDeLaCarrera(i).nombre)
                    }
                    val selec = readInt()
                    val profesor = profesoresDeLaCarrera(selec)
                    val seccion = new Seccion(asignatura,grupo,profesor,cuatrimestre,anio)
                    secciones.agregar(seccion)
                    if(secciones.total() >= 20){
                      println("\n ya no se pueden ingresar mas secciones \n")
                    }
                    printf("\n desea capturar datos de otra seccion? 1.> Si\t2.>No")
                    res2 = readInt()
                    if(res2 == 1){
                     sino = true
                    }else{
                     sino = false
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 6 => println("\n Inscribir alumno \n")
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
                    printf("\n Matricula: \n")
                    var matricula=readLine()
                    println("\n Carrera: \n")
                    var carrera = readLine()
                    println("\n Cuatrimestre (Primavera/Verano/Otoño): \n")
                    var cuatrimestre = readLine()
                    println("\n Año: \n")
                    var aniio = readInt()
                    val seccionesQueCoinciden = secciones.queCoincidanCon(carrera,cuatrimestre,aniio)
                    println("\n Seccion: \n")
                    for(i <- 0 to seccionesQueCoinciden.length){
                      println(" [ " +  i+1 + " ] " + seccionesQueCoinciden(i).asignatura.Nombre() + " - " + seccionesQueCoinciden(i).profesor.Nombre())
                    }
                    val seleccionado = readInt()
                    val seccion = seccionesQueCoinciden(seleccionado)
                    val alumno = new Alumno(nombre,numSegSocial,direccion,sexo,fechaNacimiento,carrera,matricula)
                    if(alumnos.total() >= 20){
                      println("\n ya no se pueden ingresar mas alumnos \n")
                    }else{
                      alumnos.agregar(alumno)
                    }
                    printf("\n desea capturar datos de otro alumno? 1.> Si\t2.>No")
                    res2 = readInt()
                    if(res2 == 1){
                     sino = true
                    }else{
                     sino = false
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 7 =>println("\n Calificar alumno \n")
                var res2 = 0
                var sino:Boolean = true
                while(sino == true ){
                  println("\n Matricula: \n")
                  var matricula = readLine()
                  println("\n Materia: \n")
                  val alum = alumnos.conMatricula(matricula)
                  val notasVacias = alum.materiasSinCalificar()
                  for(i <- 0 to notasVacias.length){
                   println(i+1 + notasVacias(i).seccion.carrera())
                  }
                  println("\n que materia desea calificar \n")
                  val seleccionado = readInt()
                  println("\n Calificacion: \n")
                  var calificacion = readInt()
                  notasVacias(seleccionado).Calificar(calificacion)
                  val notaClaificada = notasVacias(seleccionado)
                  notas.agregarNota(notaClaificada)
                  notas.agregarNota(notaClaificada)
                  printf("\n desea calificar a otro alumno? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                  sino = true
                  }else{
                    sino = false
                  }
                }
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 8 =>println("\n Historial Academico \n")
                var res2 = 0
                var sino:Boolean = true
                while(sino == true){
                  println("\n Matricula \n")
                  var matricula = readLine()
                  val alumno = alumnos.conMatricula(matricula)
                  val historial = alumno.historial
                  val materias = historial.notasSinCalificacion()
                  //for (materia <- materias) {
                    //println(materia.seccion().asignatura().nombre())
                  //}
                  printf("\n desea motrar otro historial academico? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                  sino = true
                  }else{
                    sino = false
                  }
                }
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 9 =>println("\n Agregar proyecto \n")
                var res2 = 0
                var sino:Boolean = true
                while(sino == true || proyectos.total() < 20 ){
                  println("\n Carrera: \n")
                  var carrera = readLine()
                  println("\n Nombre: \n")
                  var nombre = readLine()
                  println("\n Codigo: \n")
                  var codigo = readLine()
                  println("\n Fecha de inicio: \n")
                  println("\n Dia: \n")
                  val dia = readInt()
                  println("\n Mes: \n")
                  val mes = readInt()
                  println("\n Año: \n")
                  val anio = readInt()
                  var fechaInicio = new DateTime(anio,mes,dia,0,0)
                  println("\n Subvención $: \n")
                  var subvencion = readFloat()
                  println("\n Insitución: \n")
                  var institucion = readLine()
                  println("\n Investigador: \n")
                  val profes = profesores.deLaCarrera(carrera)
                  for(i <- 0 to profes.length){
                    println("[ " + i+1 + " ]" + profes(i).nombre)
                  }
                  println("\n que profesor desea ingresar como investigador del proyecto \n")
                  val seleccionado = readInt()
                  val proyecto = new Proyecto(carrera,nombre,codigo,fechaInicio,subvencion,institucion)
                  val profesor = profes(seleccionado)
                  proyecto.agregarProfesor(profesor)
                  proyectos.agregar(proyecto)
                  if(profesores.total() >= 20){
                    println("\n ya no se pueden ingresar mas proyectos \n")
                  }
                  printf("\n desea capturar datos de otro proyecto? 1.> Si\t2.>No")
                  res2 = readInt()
                  if(res2 == 1){
                    sino = true
                  }else{
                    sino = false
                  }
                }
                println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 10=>println("\n Agregar profesor a proyecto \n")
                  var res2 = 0
                var sino:Boolean = true
                  while(sino == true ){
                    println("\n Codigo: \n")
                    var codigo = readLine()
                    val  proyectoConCodigo=proyectos.conCodigo(codigo)
                    val carreraDeCodigo = proyectoConCodigo.Carrera()
                    val profesDeLaCarrera = profesores.deLaCarrera(carreraDeCodigo)
                    for(i <- 0 to profesDeLaCarrera.length){
                      println("[ " + i+1 + " ]" + profesDeLaCarrera(i).Nombre())
                    }
                    println("\n que profesor desea agregar al proyecto como investigador: \n")
                    var seleccionado = readInt()
                    val profeSeleccionado = profesDeLaCarrera(seleccionado)
                    proyectoConCodigo.agregarProfesor(profeSeleccionado)
                    if(proyectoConCodigo.contadorProfesores() >= 20){
                      println("\n ya no se pueden ingresar mas profesores al proyecto \n")
                    }
                    println("\n desea agregar otro profesor al proyecto? 1.> Si\t2.>No")
                    res2 = readInt()
                    if(res2 == 1){
                     sino = true
                    }else{
                      sino = false
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 11 =>println("\n Agregar becario a proyecto: \n")
                  var res2 = 0
                var sino:Boolean = true
                  while(sino == true ){
                    println("\n Codigo: \n")
                    var codigo = readLine()
                    val proyectoConCodigo=proyectos.conCodigo(codigo)
                    val carreraDeCodigo = proyectoConCodigo.Carrera()
                    val becariosDeLaCarrera = alumnos.deLaCarrera(carreraDeCodigo)
                    for(i <- 0 to becariosDeLaCarrera.length){
                      println("[ " + i+1 + " ]" + becariosDeLaCarrera(i).Nombre())
                    }
                    println("\n que becario desea agregar al proyecto como investigador: \n")
                    var seleccionado = readInt()
                    val becarioSeleccionado = becariosDeLaCarrera(seleccionado)
                    proyectoConCodigo.agregarBecario(becarioSeleccionado)
                    if(proyectoConCodigo.contadorBecarios() >= 20){
                      println("\n ya no se pueden ingresar mas becarios al proyecto \n")
                    }
                    printf("\n desea agregar otro becario al proyecto? 1.> Si\t2.>No")
                    res2 = readInt()
                    if(res2 == 1){
                      sino = true
                    }else{
                      sino = false
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 12 =>println("\n Buscar proyecto por código: \n")
                  var res2 = 0
                var sino:Boolean = true
                  while(sino == true){
                    println("\n Codigo: \n")
                    var codigo = readLine()
                    val proyectoConCodigo = proyectos.conCodigo(codigo)
                    proyectoConCodigo.mostrarDatos()
                    val profesoresDelProyecto = proyectoConCodigo.profesor()
                    for(i <- 0 to profesoresDelProyecto.length){
                      profesoresDelProyecto(i).mostrarDatos()
                    }
                    val  alumnosDelProyecto = proyectoConCodigo.becario()
                    for( i <- 0 to alumnosDelProyecto.length ){
                      alumnosDelProyecto(i).mostrarDatos()
                    }
                  }
                  println("\n desea regresar al menu principal? 1.> Si\t2.> No \n")
                do{
                  res = readInt()
                  if(res != 1 && res != 2){
                    println("\n opcion incorrecta \n")
                  }
                }while(res != 1 && res != 2);
                if(res == 1){
                  respuesta = true
                }else{
                  respuesta == false
                }
        case 13 =>println("\n hasta luego \n")
                  respuesta = false         
    }//finSwitch
  }//FinWhilePrincipal
}//finMain