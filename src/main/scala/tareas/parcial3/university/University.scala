package parcial3.university
import com.github.nscala_time.time.Imports._
object University extends App{
    def main(args:Array[String]){
    var option: Int = 0
    var answer: Boolean = true
    val students = new Students()
    val professors = new Professors()
    val subjects = new Subjects()
    val departments = new Departments
        while(answer==true){
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
            option = readInt()
            option match {
                case 1 => println("= Agregar Alumno =")
                    var opt = 0
                    var tof:Boolean = true
                        while(tof == true || alumnos.total() < 20 ){
                              println("\n Nombre: \n")
                              var name=readLine()
                              println("\n Numero de Seguro Social: \n")
                              var socialSecurityNumber=readLine()
                              println("\n Direccion: \n")
                              var address=readLine()
                              println("\n Sexo [M / F] \n")
                              var sex=readChar()
                              println("\n Fecha de Nacimiento \n")
                              println("\n Día: \n")
                              var day = readInt()
                              println("\n Mes: \n")
                              var month = readInt()
                              println("\n Año \n")
                              var year = readInt()
                              var dateOfBirth = new DateTime(year,month,day,0,0)
                              printf("\n Carrera: \n")
                              var career = readLine()
                              printf("\n Matricula: \n")
                              var ID=readLine()
                              val student = new Student(name,socialSecurityNumber,address,sex,dateOfBirth,career,ID)
                              students.add(student)
                                 if(students.total() >= 50){
                                    println("\nDisculpe las molestias, ya no se puede agregar más alumnos.\n")}
                                    else{
                                    }
                            printf("\n Desea capturar datos de otro alumno? 1.> Si\t2.>No")
                                opt = readInt()
                                      if(opt == 1){
                                        tof = true}
                                        else{
                                            tof = false}
                        }//while agregar.alumno
            }//match
        }//while menu
    }//def main
}//while object