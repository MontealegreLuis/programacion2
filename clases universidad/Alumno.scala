import com.github.nscala_time.time.Imports._
class Alumno(nom: String, numeroSeguro: String, dire: String,
             sex: Char, fecha: DateTime, carr: String, matr: String)

  extends Persona(nom, numeroSeguro, dire, sex, fecha, carr) {
   private val matri = matr
   private val historial = new Historial()
    def matricula(): String = {
      return matri;
    }

    def getMaterias(): Array[Nota] = {
      return historial.getNotaNoCalificada();
    }

    def calificar(nota: Nota, calif: Float) = {
      historial.setCalificacion(nota,calif);
    }

    def getHistorial(): Array[Nota] = {
      return historial.getNotaCalificada();
    }
}
