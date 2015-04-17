package parcial3.university
class Projects {
    val projects = new Array[Project](20)
    var aux:Int
    def add(project:Project){
        projects(aux) = project
        aux = aux + 1
    }
    //def withCode(code:String):Project = {
    //}
}