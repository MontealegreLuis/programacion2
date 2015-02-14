object Fizz_Buzz{
 def main(args : Array[String]){
        for(i <- 1 to 100) {
         if(i % 3 == 0 && i % 5 == 0 ){
          println("FizzBuzz")
         }
         if (i%3==0){
          println("Fizz")
         }
         if(i % 5 == 0){
          println("Buzz")
         }
         else{
          println(i)
         }
        }
 }
}
