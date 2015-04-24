
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


      def resta (b: Fraccion)  =
        {
          new Fraccion(


             this.numerador * b.denominador - this.denominador * b.numerador,
            this.denominador * b.denominador
          )
        }

        def mult (b: Fraccion)  =
          {
            new Fraccion(

                 this.numerador * b.numerador, this.denominador * b.denominador

            )
          }


          def div (b: Fraccion)  =
            {
              new Fraccion(

                   this.numerador * b.denominador , this.denominador * b.numerador

              )
            }



    def mostrar() {



      println(this.numerador + "/" + this.denominador)
  }




}
