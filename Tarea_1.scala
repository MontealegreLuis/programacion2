object Tarea_1
{
     def main(args:Array[String])
     {

        for(i <- 1 to 100)
      {

      if (((i%3)|(i%5))==0)
    {
         println("FizzBuzz",i)
    }
      else

    {
      if((i%3)==0)
        {
           println("fizz",+i)
        }
      else
        {
          if((i%5)==0)
           {
              println("buzz",+i)
           }

          else
            {
               println(+i)
            }
        }

    }




      }


     }



}
