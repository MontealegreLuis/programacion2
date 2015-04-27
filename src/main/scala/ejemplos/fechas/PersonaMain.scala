package ejemplos.fechas

import com.github.nscala_time.time.Imports._

object PersonaMain extends App {
  val luis = new Persona( new DateTime(1980, 4, 25, 0, 0))
  println(luis.fechaNacimiento.toString("dd-MM-yyyy"))
}
