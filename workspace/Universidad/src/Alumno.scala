class Alumno (a:String,b:String,c:String,d:String,e:String, f:String, g:String, h:Int, i:Int) extends Persona (a,b,c,d,e){
  
  val Matricula=f
  val Carrera=g
  val Seccion=h
  val Nota=i
   
  
  def Persona(a: String, b: String, c: String, d: String, e:String, f:String,g:String,h:Int,i:Int):Alumno={
    new Alumno (Name, NSS, Direccion,  Sexo, Fecha_nac, this.Matricula, this.Carrera, this.Seccion, this.Nota)
  }
  def this(){
    this("","","","","","","",0,0)
  }
  def Agregalum (x:Alumno):Alumno={
   println ("Introduce nombre")
   var nom=readLine
   println ("Introduce NSS")
   var nss=readLine
   println ("Proporcione la direccion")
   var dir=readLine
   println ("Sexo")
   var sex=readLine
   println("Introduce la fecha nacimient")
   var fec=readLine
   println("Introduce matricula")
   var cat=readLine
   println("Introduce Carrera")
   var depto=readLine
   //HAce falta cambiar la seccion por tipo seccion y notas
   println("Introduce numero de seccion")
   var desp=readInt
   println("Cuanto es la calificacion")
   var ext=readInt
   new Alumno (nom,nss,dir,sex,fec,cat,depto, desp,ext)
  }
}
  
  