def patMatch(x: Int):Unit = x match {
    case zero if x == 0 => println("Zero")
    case negative if x <0 => println("Negative")
    case even if x % 2 == 0 => println("Even")
    case odd if x % 2 == 1 => println("Odd")
    case _ => println("Not a number")
}

