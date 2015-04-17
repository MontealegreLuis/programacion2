package parcial3.university
class Professors{
    val teachers = new Array[Professor](10)
    var aux = 0
        def add(teacher:Professor){
        teachers(aux) = teacher
        aux = aux + 1
        }
        //def ofCareer(career:String): Array[Professor] = {
            /*var tc = new Departments()
            var aux2 = 0
                for (i <- 0 to teachers.length){
                    if (teachers(i).career = career){
                tc(i) = teachers(i)
                    aux2 = aux2 + 1
                    } 
                }*/
        //} 
        def total():Int = aux
}
        