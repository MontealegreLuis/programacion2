object main {

def main(args: Array[String]){
  
  var litsa_opciones_modelo = new Array[Opcion_Modelo](3)
  
  val a1=new Nuevo ("rojo", "TVB-2018", 250000)
  val a2=new Opcion_Modelo ("chevy 98","Sin AA, Pintura al horno, Sistema manual, Direccion Manual", 3000)
    println ("Nuevo auto de color \b" + a1.Color + " ;matricula " + a1.Matricula + " Con un valor de " + a1.Costo)
    println ("la opcion " + litsa_opciones_modelo(0).Nombre_Opcion + " tiene un coste de "+ litsa_opciones_modelo(0).Costo_Opcion )
    
  }
}
