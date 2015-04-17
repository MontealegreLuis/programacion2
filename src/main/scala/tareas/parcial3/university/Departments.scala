package parcial3.university
import com.github.nscala_time.time.Imports._
class Departments{
    val departments = new Array[Department](10)
    var aux:Int = 0
    var aux2:Int = 0
        def add(department:Department) = {
            departments(aux) = department
            aux = aux + 1
        }
        //def ofCareer(career:String):Array[Department] = {
            /*val depts = new Departments()
                for (i<-0 to departments.length){
        if(departments(i).career==career){
                        depts(i) = departments(i)
                        aux2 = aux2 + 1
                    }
                }
            return Array[depts]*/
        //}
        def totalAux():Int = aux    
        def totalAux2():Int = aux2
}