package parcial3.university
import com.github.nscala_time.time.Imports._
class Departments{
    val departments: Array[Departments](10)
    var aux = 0
        def add(department:Department){
            departments(aux) = department
            aux ++
        }
        def ofCareer(career:String):Array[Department] = {
            val depts = new Departments ()
            var aux2 = 0
                for (i<-0 to departments.length){
                    if(departments(i).career==career){
                        depts(i) = departments(i)
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