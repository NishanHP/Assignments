def fibonacci(num: Int):Int = num match {
    case 1 => 1
    case 0 => 0
    case _ =>  fibonacci(num-1) + fibonacci(num-2)
}

object q_3 extends App {
    val n = 5
    for(i <- 0 to n-1){
        println(fibonacci(i))
    }
}