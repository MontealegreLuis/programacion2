class Seccion (
    val Asignatura:String,
    val Num_grupo:Int,
    val Profe_respo:String,
    val Cuatrimestre:String,
    val Año:String,
    val Carrera:String){
    def this(){
    this("",0,"","","","")
    }
    
    def Agregaseccion(x:Seccion, y:Array[Profesor], z:Array[Asignatura]):Departamento={
  
   println("Introduzca el numero del grupo")
   var a2=readLine
    println("Carrera")
   var a6=readLine  
   println("Introduzca el año")
   var a5 = readInt
   println("Cuatrimestre")
    var aux=0
    var a4=""
    println ("[1] Primavera\n [2] Verano \n [3]Otoño")
   do{
     aux match{
       case 1=> a4="Primavera" 
       case 1=> a4="Verano" 
       case 1=> a4="Otoño" 
     }
   }while (aux!=1&&aux!=2&&aux!=3)
   
      
   println ("Seleccione el director")
   for (i<- 0 to y.length){
     println ("["+i+1+"]  =" + y(i).Name)
   }
   var nam = readInt
   var a3= y(nam).Name
   println ("Seleccione la asignatura")
   for (i<- 0 to z.length){
     println ("["+i+1+"]  =" + z(i).Nombreasig)
   }
   var nam1 = readInt
   var a1= z(nam1).Nombreasig
   new Seccion (a1,a2,a3,a4,a5,a6)
   }

}/*Cada nuevo cuatrimestre se pueden organizar varios grupos de la misma asignatura (secciones). 
Las secciones son varios grupos de la misma asignatura
Para cada uno se guarda la asignatura, el número de grupo, 
el profesor responsable de la asignatura de ese grupo junto al cuatrimestre
 y 
año en el que se impartió.

Carrera:
Grupo:
Cuatrimestre (Primavera/Verano/Otoño):
Año:
Asignatura:
[1] Programacion I
[2] Análisis y diseño de algoritmos
[3] Aplicaciones Web
Profesor:
[1] Juan Pérez
[2] Fulano de tal
[3] José López*/
