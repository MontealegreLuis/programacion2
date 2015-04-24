package ejercicios.universidad
import com.github.nscala_time.time.Imports._
class Proyectos{
	var cont : Int = 0
	var posicion = 0
	val proyectos = new Array[Proyecto](20)
	def agregar(proyecto:Proyecto){
		proyectos(cont)=proyecto
    	cont = cont+1
	}
	def total():Int = {
  		cont
  	}
  	def conCodigo(codigo:String):Proyecto ={
  	for(i <- 0 to proyectos.length){
      if(proyectos(i).Codigo() == codigo){
        posicion = i
      }
    }
    val proyecto = proyectos(posicion)
    return proyecto
  	}
} 