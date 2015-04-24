class Seccion(grup: Int, cuat: String, year: Int, asig: Asignatura, profe: Profesor)
{
  private val asignatura = asig
  private val grupo = grup
  private val profesor = profe
  private val cuatri = cuat
  private val ani = year

  def carrera(): String =  {
     return asignatura.carrera()
  }

  def nombre(): String =  {
     return asignatura.nomb()
  }

  def cuatrimestre(): String = {
    return cuatri;
  }

  def anio(): Int = {
    return ani;
  }
}
