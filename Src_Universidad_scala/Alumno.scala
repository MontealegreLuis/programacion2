class Alumno(nomb: String, numseguro: String, dir: String, sex: Char, fedenac: DateTime, car: String, matri: String)

  extends Persona(nomb, numseguro, dir, sex, fedenac, car) {
   val matricula = matri


   def modificarinformacion() ={
       nombre = "an"

    }

}
