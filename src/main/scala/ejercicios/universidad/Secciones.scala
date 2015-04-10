class Secciones{
	val secciones : Array[Seccion](20)
	def agregar(seccion : Seccion){
		secciones(cont) = seccion
    	cont++
	}
	def total():Int = {
  		cont
  	}
	def queCoincidanCon(carrera: String,cuatrimestre : String,anio : Int ): Array[Seccion] = {
		
	}
}