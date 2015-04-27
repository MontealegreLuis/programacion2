object Test {
 def main(args: Array[String]){
   
     
   val monedconarg= new Monedero(100)
   val monedsinarg= new Monedero
   
   monedsinarg.meter(monedsinarg)
   monedsinarg.sacar(monedsinarg)
   monedsinarg.toString  
   monedconarg.toString()
   
 }
}