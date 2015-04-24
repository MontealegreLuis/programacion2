import com.github.nscala_time.time.Imports._
class Profesor (nom: String, numeroSeguro: String, dire: String,
                sex: Char, fecha: DateTime, carr: String, catego: String,
                despach: Int, exten: Int, salari: Float)
    extends Persona (nom, numeroSeguro, dire, sex, fecha, carr)
{
  private val categoria = catego
  private val despacho = despach
  private val extension = exten
  var departamento : Departamento = null
  private val salario = salari

  def asignarDepartamento(depa: Departamento) = {
    departamento = depa;
  }

}
