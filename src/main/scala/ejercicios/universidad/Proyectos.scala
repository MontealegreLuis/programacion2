package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Proyectos{
	val proyectos = new Array[proyecto]
	def agregar(proyecto:Proyecto){
		proyectos(cont)=proyecto
    	cont ++
	}
	def total():Int = {
  		cont
  	}
  	def conCodigo(codigo:String):Proyecto ={
  	for(i <- 0 to proyectos.length){
      if(proyectos(i).codigo() == codigo){
        val proyecto = proyectos(i)
      }
    }
    return proyecto
  	}
}