package parcial3.university
class Sections {
    val sections = new Array[Section](40)
    var aux:Int
    def add(section:Section){
        sections(aux) = section
        aux = aux + 1
    }
    def total():Int = aux
    //def coincideWith(career:String,
    //                 fourMonthPeriod:String,
    //                 year:Int): Array[Sections] = {
    //}
}
                 