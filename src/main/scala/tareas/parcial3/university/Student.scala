package parcial3.university
import com.github.nscala_time.time.Imports._
class Student (var name: String,
               var socialSecurityNumber: String, 
               var address: String, 
               var sex: Char, 
               var dateOfBirth: DateTime)extends Person(name,socialSecurityNumber,address,sex,dateOfBirth){
    val regNum: String
    def registrationNumber(): String = {
        return regNum
    }
}


