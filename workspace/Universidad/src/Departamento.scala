class Departamento (val Nombre_depto:String, val Telefono:Int, val Carrera:String,val Directo:String) {
  
    def this(){
    this("",0,"","")
    }
   def Agregadepto(x:Departamento, y:Array[Profesor]):Departamento={
   println ("Introduce nombre del departamento")
   var nom=readLine
   println ("Introduce el telefono del departamento")
   var nss=readInt
   println ("Introduce la carrera")
   var car=readLine
   println ("Seleccione el director")
   for (i<- 0 to y.length){
     println ("["+i+1+"]  =" + y(i).Name)
   }
   var nam = readInt
   var dir= y(nam).Name
   new Departamento (nom,nss,car,dir)
   }
    
  /*Para cada departamento se guarda su 
   * nombre, teléfono, y quien es su director (un profesor).
   * 
   * Si se selecciona la opción Agregar departamento el usuario debe ser capaz de capturar los siguientes datos:
Nombre:
Teléfono:
Carrera:
Director:
[1] Juan Pérez
[2] Fulano de tal
[3] José López*/
}