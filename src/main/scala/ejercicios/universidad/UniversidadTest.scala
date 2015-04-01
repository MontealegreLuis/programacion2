package ejercicios.universidad
import com.github.nscala_time.time.Imports._
object Universidad extends App{
    var res : Int = 0
    var respuesta : Boolean = true
    var opcion : Int = 0
    respuesta = true
    val alumnos = new Array[Alumno](20)
    val profesores = new Array[Profesor](20)
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
                var i : Int =0
                while(sino == true || i < 20 ){
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
                  alumnos(i)= alumno
                  i = i + 1
                  if(i >= 20){
                    println("\n ya no se pueden ingresar mas alumnos \n")
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
                var i : Int =0
                while(sino == true || i < 20 ){
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
                  println("\n Departamento: \n")
                  println("\n Nombre del departamento: \n")
                  var nomDpto = readLine()
                  println("\n Telefono del departamento: \n")
                  var numDpto = readLine()
                  println("\n Director:")
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
                  val director = new Profesor(nombre,numSegSocial,direccion,sexo,fechaNacimiento,carrera,categoria,despacho,extencion,salario)
                  println("\n Carrera: \n")
                  var carr = readLine()
                  val dpto = new Departamento(nomDpto,numDpto,director,carr)
                  profesor.asignarADepartamento(dpto)
                  profesores(i) = profesor
                  i = i + 1
                  if(i >= 20){
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
        case 3 =>println("")
    }
  }
}
