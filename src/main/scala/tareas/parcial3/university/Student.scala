package parcial3.university
import com.github.nscala_time.time.Imports._
class Student (val name:String,
               val socialSecurityNumber:Int, 
               val address:String, 
               val sex:String, 
               valdateOfBirth: DateTime, 
               )extends Person(name,socialSecurityNumber,address,sex,dateOfBirth){
    val career:String, 
    val ID:String
    def ID(): String{
    }
}


