object FizzoBuzz{
 def main(args:Array[String]){
    var ban=0
   for (x<-1 to 100){
    ban=1
    if(x%3==0&&x%5==0)
      println("FizzBuzz")
    if ((x%3) == 0){
      println("Fizz")
      ban=0
    }
    if ((x%5)==0){
      println("Buzz")
      ban=0
    }
    if(ban==1)
      println(x)
    }
  }
}
