package tareas.uni
class Subjects {
    val subjects = new Array[Subject](30)
    private var aux: Int = 0
    private var aux2: Int = 0
    def add(subject: Subject) = {
        subjects(aux) = subject
        aux = aux + 1
    }
    def ofCareer(career:String): Array[Subject] = {
        val sub = new Array[Subject](30)
        var aux2: Int = 0
        for (i <- 0 to subjects.length){
            if(subjects(i).Career == career){
               aux2 = aux2 + 1
            }
        }
    return sub
    }
    def totalSubjects():Int = aux
    def totalOfCareer():Int = aux2
}