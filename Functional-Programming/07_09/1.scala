def displayInventory(items: Array[String], qty: Array[Int]):Unit = {
    for(i <- items.indices){
        println(items(i) + "\t: " + qty(i))
    }
}

def restockItem(items: Array[String], qty: Array[Int], item: String, quantity: Int):Unit = {
    var found = false
    for(i <- items.indices){
       if(items(i) == item){
        qty(i) += quantity
        found = true
        println("Quantity updated")
       }
    }
    if(!found)
        println(s"\nNo item found with name $item")
}

def sellItem(items: Array[String], qty: Array[Int], item: String, quantity: Int):Unit = {
    var found = false
    for(i <- items.indices){
       if(items(i) == item){
        qty(i) -= quantity
        found = true
        println("Item found and quantity reduced")
       }
    }
    if(!found)
        println(s"\nNo item found with name $item")
}

object main extends App{
    var items = Array("Apple", "Banana", "Grapes", "Pears", "Orange")
    var qty = Array(200, 100, 400, 100, 250)

    displayInventory(items, qty)

    restockItem(items, qty, "Peach", 300)

    println("\n")
    displayInventory(items, qty)

    
    sellItem(items, qty, "Apple", 100)

    println("\n")
    displayInventory(items, qty)
}