class Profesor (a:String,b:String,c:String,d:String,e:String, f:String, g:String, h:Int, i:Int, j:Int) extends Persona (a,b,c,d,e){
  
  val Catego=f
  val Depto=g
  val Num_despacho=h
  val Extension=i
  val Salario=j
   
  
  def Persona(a: String, b: String, c: String, d: String, e:String, f:String,g:String,h:Int,i:Int,j:Int):Profesor={
    new Profesor (Name, NSS, Direccion,  Sexo, Fecha_nac, this.Catego, this.Depto, this.Num_despacho, this.Extension, this.Salario)
  }
   def this(){
    this("","","","","","","",0,0,0)
  }
  
  def Agregaprofe (x:Profesor):Profesor={
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
   println("Introduce categoria")
   var cat=readLine
   println("Introduce numero de departamento")
   var depto=readLine
   println("Introduce numero de despacho")
   var desp=readInt
   println("Proporciona numero de extension")
   var ext=readInt
   println("Cuanto es el salario")
   var sal=readInt
   new Profesor (nom,nss,dir,sex,fec,cat,depto, desp,ext,sal)
  }
  
}