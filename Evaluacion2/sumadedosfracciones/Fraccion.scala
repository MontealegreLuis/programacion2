
class Fraccion(n: Int , d: Int ) {
    private val numerador =  n
    private val denominador = d


    def suma (b: Fraccion)  =
      {
        new Fraccion(


           this.numerador * b.denominador + this.denominador * b.numerador,
          this.denominador * b.denominador
        )



      }

    def mostrar() {


      println("la suma de fracciones es = ")
      println(this.numerador + "/" + this.denominador)


    }


}
