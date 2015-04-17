class Racional (n: Int , d: Int){
    private val divisor = mcd(n,d)
        val numerador = n / divisor
        val denominador = d / divisor
    
//Metodo privado. M�ximo Com�n Divisor (Reducir la fracci�n a su menor expresi�n)
    private def mcd(a: Int , b: Int):Int={
        if(b == 0){
            return a
        }else{
            mcd(b , a % b)
        }
}  
    
//Suma de 2 fracciones.
    
def add(b: Racional):Racional = {
    new Racional(numerador * b.denominador + denominador * b.numerador , denominador * b.denominador)
}

//Resta de 2 fracciones.
def subtrac(b: Racional):Racional = {
    new Racional(numerador * b.denominador - b.numerador * denominador , denominador * b.denominador)
}
//Multiplicaci�n de 2 fracciones.    
def multiply(b: Racional):Racional ={
    new Racional(numerador * b.numerador , denominador * b.denominador)
}
    
//Divisi�n de 2 fracciones.
def divide(b: Racional):Racional ={
    new Racional(numerador * b.denominador , denominador * b.numerador)
    }
}