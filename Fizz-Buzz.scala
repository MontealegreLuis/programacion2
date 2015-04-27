object FizzBuzz{
def main (args: Array [String]){
for (x<- 0 to 100)
  { 
    if ((x%3)==0|(x%5)==0)
       {
        if((x%3)==0)
          println("fizz")
        if((x%5)==0)
          println("buzz")
        if((x%3)==0 &&(x%5)==0)
          println("Fizz-Buzz")  
        }
      else
        println(x) 
  }
}
}
