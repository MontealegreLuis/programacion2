class Profesores{
  val profesores : Array[Profesor](6)
  var cont = 0
  def agregar(profesor:Profesor){
    profesores(cont)=profesor
    cont ++
  }
  def deLaCarrera(carrera : String): Array[Profesor] = {
  	val profes = new Departamentos()
  	var con = 0
  	for(i <- 0 to profesores.length){
  		if(profesores(i).carrera == carrera){
  			profes(i)=profesores(i)
  			con ++
  		}
  	}
  	return deptos
  }
  def total():Int = {
  	cont
  }
}