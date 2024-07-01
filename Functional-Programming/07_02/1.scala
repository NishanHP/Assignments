def revString(x: String, z: Int): String = {
    if (z < 0) ""  
    else s"${x.charAt(z)}${revString(x, z - 1)}"  
}

object main extends App {
    val string = "This string will be reversed"

    val res = revString(string, string.length - 1)
    println(res)
}
