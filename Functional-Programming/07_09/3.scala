object q_3 extends App {
  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def firstAndLastUpper(input: String): String = {
    input.substring(0, 1).toUpperCase + input.substring(1, input.length - 1).toLowerCase() + input.substring(input.length - 1).toUpperCase
  }

  def first2Upper(input: String): String = {
    input.substring(0, 2).toUpperCase + input.substring(2).toLowerCase()
  }

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  println(formatNames(names(0), toUpper)) 
  println(formatNames(names(1), first2Upper)) 
  println(formatNames(names(2), toLower)) 
  println(formatNames(names(3), firstAndLastUpper)) 
}
