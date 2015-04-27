import com.github.nscala_time.time.Imports._
class Persona(nom: String, numeroSeguro: String, dire: String, sex: Char, fecha: DateTime, carr: String)
{
  private val nomb = nom
  private val numeroSeguroSocial = numeroSeguro
  private val direccion = dire
  private val sexo = sex
  private val fechaNacimiento = fecha
  private val carrer = carr


  def nombre(): String = {
    return nomb;
  }

  def carrera(): String =
  {
    return carrer
  }


}
