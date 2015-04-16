class rational {

  //atributes
  val numerador: Int  =0
  val denominador: Int =0

  //construcotres
  class rational (n: Int, d: Int ){
    val numerador =n
    val denominador=d
  }
  
  //metodos
  def add (a: rational, b:rational ): rational ={
    new rational (a.numerador*b.denominador+a.denominador*b.numerador,a.denominador*b.denominador)
  }

  //EJERCICIO
  //IMPLEMENTAR LOS METODOS PARA  -*/
  //metodos tarea
  
  def subtract (a: rational, b:rational ): rational={
    new rational (a.numerador*b.denominador-a.denominador*b.numerador,a.denominador*b.denominador)
  }
  
  def multiply (a: rational, b:rational ): rational={
    new rational (a.numerador*b.numerador,a.denominador*b.denominador)
  }
  
  def divide (a: rational, b:rational ): rational={
    new rational (a.numerador*b.denominador,a.denominador*b.numerador)
    
  }
}