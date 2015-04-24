package tareas.uni
import com.github.nscala_time.time.Imports._
class Student (val nameS: String,
               val socialSecurityNumberS: String, 
               val addressS: String, 
               val sexS: Char, 
               val dateOfBirthS: DateTime,
               val careerS:String,
               val regNumber:String)extends             Person(nameS,socialSecurityNumberS,addressS,sexS,dateOfBirthS,careerS)
    {
        
    var history = new academicHistory()
        
    def registrationNumber(): String = regNumber   
    
    def subjectsUnrated(): Array[Note] = {
        val notesUnrated = history.notesUnrated()
        notesUnrated
    }    
    def showStudent(){
        println("\nLos datos que ingreso son los siguientes:\n")
        println("\tNombre: " + nameS)
        println("\tNumero del Seguro Social: " + socialSecurityNumberS)
        println("\tDireccion: " + addressS)
        println("\tSexo: " + sexS)
        println("\tFecha de Nacimiento: " + dateOfBirthS)
        println("\tCarrera: " + careerS)
        println("\tMatricula: " + regNumber + "\n")
    }
        
    def History(): Unit = history.showNotes
    def Name(): String = nameS
 }
