import scala.io.StdIn

object PatternMatchingApp extends App{
    println("Enter a number")
    var input = StdIn.readInt()

    val evaluateInput: Int => String = {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(evaluateInput(input))
}
