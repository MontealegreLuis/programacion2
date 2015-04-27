object rational {

    def main(args: Array[String]) {

    val rat = new rational(1, 2)
    println(rat)
    val divisor = gcd(1, 2)
    val rat2 = new rational(3, 2)
    val res = rat sum rat2
    val res2 = rat2 rest rat
    val res3 = rat mul rat2
    val res4 = rat div rat2 
    println("suma:"+res)
    println("resta:"+res2)
    println("multi:"+res3)
    println("div"+res4)
    println(divisor)
}
}

class rational(n: Int , d: Int) {


require(d !=0)

val numer: Int = n

val denom: Int= d

override def toString = numer + "/" + denom

def sum(that: rational): rational =

new rational(

numer*that.denom + that.numer*denom,

denom*that.denom

)

private def rest(that: rational): rational =
new rational(

numer*that.denom - that.numer*denom,

denom*that.denom
)

private def mul(that: rational): rational =
new rational(
numer*that.numer,denom*that.denom
)

private def div(that: rational): rational =
new rational(
numer*that.denom,denom*that.numer
)  
 
private def gcd(Int : Int): Int = {

 if (d == 0) {

 n

 } else {

 gcd(d, n % d)

 }

 }
}

