class Departamentos{
  val departamentos : Array[Departamento](6)
  var cont = 0
  def agregar(departamento:Departamento){
    departamentos(cont)=departamento
    cont ++
  }
  def deLaCarrera(carrera: String):Array[Departamento] = {
  	val deptos = new Departamentos()
  	var con = 0
  	for(i <- 0 to departamentos.length){
  		if(departamentos(i).carrera == carrera){
  			deptos(i)=departamentos(i)
  			con ++
  		}
  	}
  	return deptos
  }
  def totalCon():Int{
  	con
  }
  def total():Int = {
  	cont
  }
}
