import scala.io.StdIn

def getProduct(): List[String] = {
  var stop = false
  var products = List.empty[String]

  while (!stop) {
    val productName = StdIn.readLine("Enter Product name: ")

    if (productName == "done") {
      stop = true
    } else {
      products = products :+ productName
    }
  }
  
  products
}

def printProductList(list: List[String]): Unit = {
    list.foreach(println)
}

def getTotalProducts(list: List[String]): Int = {
    list.length
}
