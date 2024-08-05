def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if(num == 2) true
    else !(2 until num).exists(i => num % i == 0)
}

def filterPrime(list: List[Int]): List[Int] = {
    list.filter(num => isPrime(num))
}

object q3 extends App{
    val nums = List(1,2,3,4,5,6)
    print(filterPrime(nums))
}