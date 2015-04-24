class Asignatura(nomb: String, codi: String, descri: String, dep: Departamento, carr: String)
{
  private val nombre = nomb
  private val codigo = codi
  private val depa = dep
  private val descripcion = descri
  private val carre = carr

  def carrera(): String = {
    return carre;
  }


 def nomb (): String = 
   {
     return nombre
   }
}
