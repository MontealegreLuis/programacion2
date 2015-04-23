class VentaDeAutos(){

  private val ventadeautos =  new Array[VentaDeAuto](1000)
      private val tope = 1000
      private var index = 0

      def agregar(ventadeauto: VentaDeAuto)
      {
           if (index < (tope-1))
           {
             ventadeautos(index) = ventadeauto
             index = index + 1
           }
      }






}
