package tareas.uni
import com.github.nscala_time.time.Imports._
class Department(name: String,
                 telephone: String,
                 career: String)
{
        val nameD = name
        val telephoneD = telephone
        val careerD = career
    def Career(): String = careerD     
    def Name():String = nameD
    def showDepartment(){
        println("\nLos datos que ingreso son los siguientes:\n")
        println("\tNombre: " + nameD)
        println("\tTelefono: " + telephone)
        println("\tCarrera: " + careerD + "\n")
       
    }
}