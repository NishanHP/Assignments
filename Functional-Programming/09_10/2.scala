class Rational(num: Int, dnum: Int) {
  require(dnum != 0, "Denominator can't be zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g = gcd(num.abs, dnum.abs)

  private val numer = num / g
  private val dnumer = dnum / g

  def sub(other: Rational): Rational = {
    val commonDenom = this.dnumer * other.dnumer
    val newNumer = this.numer * other.dnumer - other.numer * this.dnumer
    new Rational(newNumer, commonDenom) 
  }
  override def toString: String = s"$numer/$dnumer"
}

object Main extends App {
  val x = new Rational(3, 4)  
  val y = new Rational(5, 8)  
  val z = new Rational(2, 7) 

  val result1 = y.sub(z)
  val result2 = x.sub(result1)

  println(s"Result of x - (y - z): $result2") // Output: Result of x - (y - z)
}
