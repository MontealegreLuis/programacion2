class Projectos {
    val projecto:Array[Projecto](20)
    var aux:Int
    def add(projecto:Projecto){
        projectos(aux) = projecto
        aux ++
    }
    def withCodigo(codigo:String):Projecto{
    }
}