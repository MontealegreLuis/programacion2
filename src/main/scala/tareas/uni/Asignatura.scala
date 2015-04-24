package tareas.uni
class Subject (val name: String, 
               val code: Int, 
               val description: String, 
               val career: String){

def showSubject(){
        println("\n Los datos que ingreso son los siguientes:\n")
        println("\t Nombre: " + name)
        println("\t Codigo: " + code)
        println("\t Descripcion: " + description)
        println("\t Carrera: " + career)
       
    }


   
    def Career():String = career
    def Name():String = name
}