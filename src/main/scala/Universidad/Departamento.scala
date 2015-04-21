class Departamento(nomb: String, tel: Int, carr: String, dire: Profesor)
{
   private val nombre = nomb
   private val telefono = tel
   private val carre = carr

  def carrer(): String = {
    return carre;
  }

  def getNombre(): String = {
    return nombre
  }

}
