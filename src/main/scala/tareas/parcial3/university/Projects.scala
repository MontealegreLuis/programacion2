class Projects {
    val projects:Array[Project](20)
    var aux:Int
    def add(project:Project){
        projects(aux) = project
        aux ++
    }
    def withCode(code:String):Project{
    }
}