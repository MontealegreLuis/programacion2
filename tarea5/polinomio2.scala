
   object Polinomio2{

     def main(args: Array[String])
     {
       var c = Array(2,5,3,-2)
       var e = 1;
       var Suma1 = 0;
       var Sum = 0;

       println(""+c(0)+"x^"+e+ "+" +c(1))
       println("+")
       println(""+c(2)+"x^"+e+ "" +c(3))
       println("_________")

       Sum = c(0)+c(2)
       Suma1= c(1)+c(3)

       println(""+Sum+"x^"+e+"+"+Suma1)

     }


   }
