object Test {
 def main(args: Array[String]){
  
   var menumain=0
   //Alumnos
   var listalum= new  Array[Alumno](100)
   var contalum=0
   //Profesor
   var listprofe= new Array[Profesor](100)
   var contprofe=0
   //Asignatura
   var listasig= new Array[Asignatura](100)
   var contasig=0
   //Departamentos
   var listdepto= new Array[Departamento](100)
   var contdepto=0

   
   do{
     
    println("Ingresa el número de la opción que deseas:")
    println("[ 1] Agregar alumno")
    
    println("[ 2] Agregar profesor")
    
    println("[ 3] Agregar asignatura")
    
    println("[ 4] Agregar departamento")
    println("[ 5] Agregar sección")
    println("[ 6] Inscribir alumno")
    println("[ 7] Calificar alumno")
    println("[ 8] Historial académico")
    println("[ 9] Agregar proyecto")
    println("[10] Agregar profesor a proyecto")
    println("[11] Agregar becario a proyecto")
    println("[12] Buscar proyecto por código")
    println("[13] Salir")
    menumain=readInt
    menumain match{
      //Alumno agregar
      case 1 => var aux= new Alumno 
        listalum(contalum)= aux.Agregalum(aux)
      //Profesor agregar
      case 2 => var aux= new Profesor
        listprofe(contprofe)= aux.Agregaprofe(aux)
      //Asignatura agregar
      case 3 => var aux= new Profesor
        if (contdepto==0) println("No es posible agregar una asignatura porque no se tienen departamentos registrados")
        else {//Aqui agrega asignatura
          var aux = new Asignatura
          listasig(contasig) = aux.Agregasignatura(aux, listdepto)
        }
      //Departamentos
      case 4 => if (contprofe==0) println("No se puede registrar un departamento sin tener profesores para asignar")
        else {
          var aux = new Departamento
          listdepto(contdepto) = aux.Agregadepto(aux, listprofe)
        }
      //Seccion
      case 5 =>
      case 6 =>
      case 7 =>
      case 8 =>
      case 9 =>
      case 10 =>
      case 11 =>
      case 12 =>
      case 13 =>
      case default =>
    }
     
   }while (menumain!=13&&menumain>0&&menumain<14)
   
   }}