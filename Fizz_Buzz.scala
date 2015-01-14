object Fizz_Buzz{

	def main(args:Array[String]){

	for (x <- 1 to 20)
	{
		if (((x % 3)== 0) && ((x % 5)== 0))
			println("Fizz Buzz")
		else if ((x % 3)== 0)
			 println("Fizz")		
		     else if ((x % 5)== 0)
			 	println("Buzz")		
		     	  else 
			  	println(x)	
	}

 }
}
