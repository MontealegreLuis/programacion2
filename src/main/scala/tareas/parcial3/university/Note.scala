package parcial3.university
class Note (sec:Section){
    val section = sec
    var grade :Float = 0
    def toRate(g: Int){
        grade = g
    }
    def itsRating(): Boolean {
    }
}