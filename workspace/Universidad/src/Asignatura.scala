class Asignatura (a:String,b:String,c:String,d:String){
  
  val Nombreasig=a
  val Codigo=b
  val Descripcion=c
  val Departamento=d
    def this(){
    this("","","","")
    }
    
    def Agregasignatura (x:Asignatura, y:Array[Departamento]):Asignatura={
   println ("Introduce nombre de la asignatura")
   var nom=readLine
   println ("Introduce el codigo ")
   var nss=readLine
   println ("Proporcione una descripcion de la asignatura")
   var dir=readLine
   println ("Seleccione el departamento")
   for (i<-0 to y.length){
     println ("["+ i+1 +"]  =" + y(i).Nombre_depto)
   }
   var nam=readInt
   var dep=y(nam).Nombre_depto
   new Asignatura (nom,nss,dir,dep)
  }
    
   /*Para cada asignatura se mantiene su nombre, código, descripción y departamento.*/
}