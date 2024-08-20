object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = amount => amount match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case x if x > 2000000 => x * 0.065
    }

    println(calculateInterest(15000))    
    println(calculateInterest(50000))    
  }
}