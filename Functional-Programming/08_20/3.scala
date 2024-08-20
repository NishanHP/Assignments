object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase
  def toLower(str: String): String = str.toLowerCase

    //first and last to upper
  def capitalizeFirstAndLast(str: String): String = {
    if (str.length <= 1) str.toUpperCase
    else str.head.toUpper + str.substring(1, str.length - 1).toLowerCase + str.last.toUpper
  }

  // first 2 upper
  def capitalizeFirstTwo(str: String): String = {
    if (str.length <= 2) str.toUpperCase
    else str.substring(0, 2).toUpperCase + str.substring(2).toLowerCase
  }

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))  
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) // NIroshan
    println(formatNames("Saman")(toLower))  
    println(formatNames("Kumara")(name => name.capitalize)) 
  }
}
