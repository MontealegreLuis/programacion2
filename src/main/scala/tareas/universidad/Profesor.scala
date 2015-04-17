package tareas.universidad
import com.github.nscala_time.time.Imports._
class Profesor(val categoria:String,
               val despacho:Int, 
               val extension:String, 
               val departamento:Departamento, 
               val salario:float,)
               extends Persona(nombre,numeroSeguroSocial,direccion,sexo,fechaNacimiento){
    def assingndepartamento(departamento:Departamento){
        this.departamento = depts
    }
                   
}