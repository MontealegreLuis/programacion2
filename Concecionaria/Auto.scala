
class Auto(nomb: String, mat: String, col: String, model: Int, prec: Float){

    private val nombre = nomb
    private val matricula = mat
    private val color = col
    private val modelo = model
    private val precio = prec


    def nombr(): String = {

      return nombre;
    }


    def mode(): Int = {

      return modelo;
    }

    def pre(): Float =
      {
        return precio
      }

}
