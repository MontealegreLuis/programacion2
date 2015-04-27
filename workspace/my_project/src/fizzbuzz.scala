object fizzbuzz {
  
  def main(args:Array[String]){
    
    for (x <- 1 to 100)
    {
     //si es multi´plo de 3 imprime fizz
     //si es multiplo de 5 imprime buzz
     //si es multiplo de ambos imprime fizzbuzz
     if ((x%5==0) && (x%3==0))
        println("fizzbizz")
      else if (x%3==0)
        println("fizz")
      else if (x%5==0)
        println("buzz")
      else
        println(x)
    }
}

}
