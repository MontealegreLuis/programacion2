object PolinomioTest2 {
  def main(args :Array[String]){
    var polinomio1 = new Polinomio(3);
    polinomio1.agregarTermino(2,3);
    esVerdadero(polinomio1.evaluar(3) == 54,"2x^3 deberia ser 54 con x = 3");
    polinomio1.agregarTermino(5,2);
    esVerdadero(polinomio1.evaluar(2) == 36,"2x^3 + 5x^2 deberia ser 36 con x = 2");
    polinomio1.agregarTermino(3,2);

    esVerdadero(polinomio1.mostrar() == "8.0x^2 + 2.0x^3","el polinomio deberia ser 2x^3 + 8x^2");

    val b = new Polinomio(2)
    b.agregarTermino(3,0)
    b.agregarTermino(5,1)
    var suma = polinomio1.sumar(b)
    esVerdadero(suma.mostrar() == "3.0x^0 + 5.0x^1 + 16.0x^2 + 2.0x^3", "el polinomio deberia ser 2x^3 + 8x^2 + 5x + 3")
    var multiplica = polinomio1.multiplicacion(b)

    println(multiplica.muestra())
    /*println(polinomio1.multiplicacion(b))
    esVerdadero(multiplica.mostrar() == "24.0x^2 + 46.0x^3 + 10.0x^4","el polinomio deberia ser 24x^2 + 56x^3")*/
  }
  def esVerdadero(resultado: Boolean, mensaje: String) {
        if (!resultado) {
            println(mensaje)
        }
  }

}
