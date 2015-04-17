package parcial3.university
class Subjects {
    val subjects = new Array[Subject](30)
    var aux = 0
    var aux2 = 0
    def add(subject: Subject) = {
        subjects(aux) = subject
        aux = aux + 1
    }
    //def ofCareer(career:String): Array[Subject] = {  
    //}
    def total():Int = aux
}