object fizzbuzz{

  def main(args:Array[String]){

  for (num <- 1 to 100) {
    if (( (num % 3) == 0 ) && ( (num % 5) == 0 ))
      println("Fizz_Buzz")
    else if ( (num % 3) == 0)
       println("Fizz")
    else if ((num % 5)== 0)
         println("Buzz")
    else
        println(num)
  }
 }
}
