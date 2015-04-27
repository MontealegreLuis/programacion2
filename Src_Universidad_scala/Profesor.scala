class Profesor (nomb: String, numseguro: String, dir: String, sex: Char, fedenac: DateTinme, cat: Char,
                desp: Int, ext: Int, sala: Float)
    extends Persona (nomb, numseguro, dir, sex, fedenac)
{
  private val categoria = cat
  private val despacho = desp
  private val extension = ext
  private val salario = sala

  def Profesor(Nombre: String, NumerodeSeguroSocial: String, Direccion: String, Sexo: Char, FechaDeNacimiento: String  ) = {

     }

}
