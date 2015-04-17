package parcial3.university
class Students{
    val students = new Array[Student](50)
    var aux = 0
        def add(student:Student): Unit = {
            students(aux) = student
            aux = aux + 1
        }
        /*def ofCareer(career: String): Array[Student] = {
        }
        def withRegistrationNumber(rg: String): Student = {
        }*/
        def total():Int = aux

}