def calculateSquare(list: List[Int]): List[Int] = {
    list.map(num => num*num)
}

object q2 extends App{
    val nums = List(1,2,3,4,5,6)
    println(calculateSquare(nums))
}