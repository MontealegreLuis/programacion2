package parcial3.calculadora
class Racional (n: Int , d: Int){
    private val divisor = mcd(n,d)
        val numerador = n / divisor
        val denominador = d / divisor
    

    private def mcd(a: Int , b: Int):Int={
        if(b == 0){
            return a
        }else{
            mcd(b , a % b)
        }
}  
    
  
def suma(b: Racional):Racional = {
    new Racional(numerador * b.denominador + denominador * b.numerador , denominador * b.denominador)
}


def resta(b: Racional):Racional = {
    new Racional(numerador * b.denominador - b.numerador * denominador , denominador * b.denominador)
}
    
def multiplicacion(b: Racional):Racional ={
    new Racional(numerador * b.numerador , denominador * b.denominador)
}
    

def division(b: Racional):Racional ={
    new Racional(numerador * b.denominador , denominador * b.numerador)
    }
    

def resultado(): String = {
numerador + "/" + denominador
}
}