class Rational(num: Int, dnum: Int){
    require(dnum != 0, "Denominator can't be zero")

    private def gcd(a: Int, b: Int): Int = if(b ==0) a else gcd (b, a%b)
    
    private val g = gcd(num.abs, dnum.abs)

    private val numer = num / g
    private val dnumer = dnum / g

    def neg: Rational = new Rational(-numer, dnumer)

    override def toString: String = s"$numer/$dnumer"
}

