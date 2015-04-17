package tareas.universidad
class Profesores{
    val maestros: Array[Profesores](10)
    var aux = 0
        def add(maestro:Profesor){
        maestros(aux) = maestro
        aux ++
        }
        def ofCarrera (carrera:String):Array[Profesor]={
            val tc = new Departamentos()
            var aux2 = 0
            for (i <- 0 to maestros.length){
                if (maestros(i).carrera = carrera){
                tc(i) = maestros(i)
                    aux2 ++
                }
            }
            return detps
        }
    
        def total():Int = aux
}