package parcial3.university
class Students{
    val students:Array[Student](50)
    var aux = 0
        def agregar (student:Student){
            students(aux) = student
            aux ++
        }
        def withID(id: String):Student ={
            this.ID = id
        }
        def total():Int {
            aux
        }
}