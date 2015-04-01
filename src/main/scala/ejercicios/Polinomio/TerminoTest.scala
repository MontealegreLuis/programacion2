object TerminoTest {

    def main(args: Array[String]) {
        var termino = new Termino(10, 2)

        esVerdadero (
            termino.evaluar(2) == 40,"10x^2 debería ser 40 con x = 2")

        var termino2 = new Termino(3, 2)

        esVerdadero(
            termino.tieneMismoGrado(termino2),"10x^2 debería tener el mismo grado que 3x^2")

        var termino3 = new Termino(5, 3)

        esVerdadero(
            !termino2.tieneMismoGrado(termino3),"3x^2 NO debería tener el mismo grado que 5x^3")

        var termino4 = new Termino(13, 2)

        esVerdadero(
            termino4.esIgual(termino.reducir(termino2)),"3x^2 + 10x^2 debería ser 13x^2")

        esVerdadero(termino4.mostrar() == "13.0x^2","El termino deberia ser 13.0x^2")
    }

    def esVerdadero(resultado: Boolean, mensaje: String) {
        if (!resultado) {
            println(mensaje)
        }
    }
}
