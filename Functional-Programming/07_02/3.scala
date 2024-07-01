def mean(num1: Int, num2:Int):Float = {
    return (num1 + num2).toFloat / 2.0f
}

object Q3 extends App{
    var meanVal = mean(4, 3)

    //val x = BigDecimal(4.54846).setScale(2, BigDecimal.RoundingMode.DOWN).toFloat
    //println(f"$x%.2f")

    println(f"$meanVal%.2f")
}