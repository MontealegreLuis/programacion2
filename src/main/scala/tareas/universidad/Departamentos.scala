package tareas.universidad

class Departamentos{
    val departamentos:Array[Departamentos](10)
    var aux = 0
        def add(departamentos:Departamentos){
            departmentos(aux) = departamentos
            aux ++
        }
        def ofCarrera(carrera:String):Array[Departamentos] = {
            val depts = new Departamentos()
            var aux2 = 0
                for (i<-0 to departamentos.length){
                    if(departamentos(i).carrera==carrera){
                        depts(i) = departamentos(i)
                        aux2 ++
                    }
                    
                }
            return depts
        }
    def totalAux():Int{
        aux    
    }
    def totalAux2():Int{
        aux2
    }
}