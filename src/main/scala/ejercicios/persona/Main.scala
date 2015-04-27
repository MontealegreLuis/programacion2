import com.github.nsacala_time.time.Imports._
object PersonMain extends App{
  val luis = new Person(new DateTime(1980,4,25,0,0))
  println(luis.birthday.toString("dd-MM-yyyy"))
}
