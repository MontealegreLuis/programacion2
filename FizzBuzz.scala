object FizzBuzz{
  def main(args:Aarray[String]){
    for(i <- to 100){                               // <console>:3: error: ')' expected but integer literal found.
      if(i % 3 == 0 && i % 5 == 0){                 //            for(i <- to 100){
        println("FizzBuzz")                         //                        ^
      }else if(i % 3 == 0){
        println("Fizz")
      }else if(i % 5 == 0){
        println("Buzz")
      }else{
        println(i)
      }
    }
  }                                                 // <console>:8: error: not found: value i
}                                                   //                     if(i % 3 == 0 && i % 5 == 0){
                                                    //                        ^
