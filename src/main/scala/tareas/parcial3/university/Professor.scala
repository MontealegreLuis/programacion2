package parcial3.university
import com.github.nscala_time.time.Imports._
class Profesor val name:String,
               val socialSecurityNumber:Int, 
               val address:String, 
               val sex:String, 
               val dateOfBirth: DateTime,
               val officeNumber: Int
               val extension: Int
               val salario: Float
               )extends Person(name,socialSecurityNumber,address,sex,dateOfBirth){
    var department: Department   
    def assignDepartment (dep:Department){
        this. departament = depts
    }
                   
}