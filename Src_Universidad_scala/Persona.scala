import com.github.nscala_time.time.Imports._
class Persona(nomb: String, numseguro: String, dir: String, sex: Char, fedenac: DateTime, car: String)
{
  private val Nombre = nomb
  private val NumerodeSeguroSocial = numseguro
  private val Direccion = dir
  private val Sexo = sex
  private val FechadeNacimiento = fedenac
  private val Carrera = car
  def persona(Nombre: String, NumerodeSeguroSocial: String, Direccion: String, Sexo: Char, FechadeNacimiento: String ) = {
     }
     def carrera(): String = car
                              }
