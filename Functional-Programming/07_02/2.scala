def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}

object Q2 extends App() {
    val ipList = List("Apple", "Banana", "Peaches", "ElderBerry", "Tree")
    val res = filterStrings(ipList)

    println(res)
}