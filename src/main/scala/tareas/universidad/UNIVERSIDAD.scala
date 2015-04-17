package tareas.universidad
import com.github.nscala_time.time.Imports._
object Universidad extends App{
    def main(args:Array[String]){
    var opcion: Int = 0
    var pregunta: Boolean = true
    val alumnos = new Alumnos()
    val profesores = new Profesores()
    val asignaturas = new Asignaturas()
    val departamentos = new Departamentos
        while(pregunta==true){
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
            opcion match {
                case 1 => println("= Agregar Alumno =")
                    var opt = 0
                    var tof:Boolean = true
                        while(tof == true || alumnos.total() < 20 ){
                              println("\n Nombre: \n")
                              var nombre=readLine()
                              println("\n Numero de Seguro Social: \n")
                              var numeroSeguroSocial=readLine()
                              println("\n Direccion: \n")
                              var direccion=readLine()
                              println("\n Sexo [M / F] \n")
                              var sexo=readChar()
                              println("\n Fecha de Nacimiento \n")
                              println("\n Día: \n")
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
                              val alumno = new Alumno(nombre,numeroSeguroSocial,direccion,sexo,fechaNacimiento,carrera,matricula)
                              alumnos.agregar(alumno)
                                 if(alumnos.total() >= 50){
                                    println("\n No se puede agregar más alumnos.\n")}
                                    else{
                                   }
                            printf("\n Desea capturar datos de otro alumno? 1.> Si\t2.>No")
                                opt = readInt()
                                      if(opt == 1){
                                        tof = true}
                                        else{
                                            tof = false}
                        }
            }
        }
    }
}