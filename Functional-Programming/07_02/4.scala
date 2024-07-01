def evenNum(x: List[Int]):Int = {
    var acc = 0

    for (i <- x.indices) {
        acc += accumilator(x(i))
    }

    acc
}

def accumilator(x: Int):Int = x match{
    case even if even % 2 == 0 => even 
    case odd => 0
}

object Q4 extends App {
    var numbers = List(1, 2, 3, 4, 5, 6, 6, 7, 8, 9)

    println("Sum of even numbers " + evenNum(numbers))
}