import scala.io.StdIn
import scala.util.{Try, Success, Failure}

def checkMultples(num: Int):Any = num match{
    case x if(x%3 == 0 && x%5 == 0) => println("Multiple of 3 and 5")
    case x if(x%3 == 0) => println("Multiple of 3")
    case x if(x%5 == 0) => println("Multiple of 5")
    case _ => println("Not a multiple of 3 or 5")
    
}

object q2 extends App{
    println("Enter a number to check if its multiple of 3 or 5")
    val x = io.StdIn.readLine()
    
    Try(x.toInt) match {
        case Success(x) => checkMultples(x)
        case Failure(_) => println("Enter a valid number")
    }


    println()
}