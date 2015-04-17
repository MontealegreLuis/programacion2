package parcial3.university
import com.github.nscala_time.time.Imports._
class Professor(val name: String,
               val socialSecurityNumber: String, 
               val address: String, 
               val sex: Char, 
               val dateOfBirth: DateTime)extends Person(name,socialSecurityNumber,address,sex,dateOfBirth){
        val category: String
    val officeNumber: Int
    val extension: Int
    var department: Department   
    val pay: Float
    def assignDepartment (department:Department){
        
    }
                   
}