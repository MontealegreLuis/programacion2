package parcial3.university
class Professors{
    val teachers: Array[Professor](10)
    var aux = 0
        def add(teacher:Professor){
        teachers(aux) = teacher
        aux ++
        }
        def ofCareer (career:String):Array[Professor]={
            val tc = new Departments()
            var aux2 = 0
            for (i <- 0 to teachers.length){
                if (teachers(i).career = career){
                tc(i) = teachers(i)
                    aux2 ++
                }
            }
            return detps
        }
    
        def total():Int = aux
}
        