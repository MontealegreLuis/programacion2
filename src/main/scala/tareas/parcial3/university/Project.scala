package parcial3.university
import com.github.nscala_time.time.Imports._
class Project(val career:String,
              val name:String,
              val code.String,
              val starDate: DateTime
              val subsidy:Float,
              val institution:String,
              val researcher:Professor,
              val professors: Professors,
              val scholarshipHolder:Students){
    def addProfessor(professor:Profesor){
    }
    def addScholarshipHolder(student:Student){
    }
    def code():String={
    }
    def career():String={
    }
}