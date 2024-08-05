def filterEvenNumbers(list: List[Int]): List[Int] = {
    list.filter(num => num%2 == 0)
}

object q1 extends App{
    var numbers = List(1,2,3,4,5,6,7,8,9)

    println(filterEvenNumbers(numbers))
}