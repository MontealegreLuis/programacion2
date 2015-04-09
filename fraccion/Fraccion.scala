
class Fraccion( d: Int ,n: Int ) {
    private val Num = n
    private val Den = d


    def suma (b: Fraccion)  =
      {
        new Fraccion(


           this.Num * b.Den + this.Den * b.Num,
           this.Den * b.Den
        )



      }

    def mostrar() {


      println("la suma de la fracciones ingresada es = ")
      println(this.Num + "/" + this.Den)


    }


}
