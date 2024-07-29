object InventoryManager extends App {
  type ProductDetails = (String, Int, Int)

  val inventory1: Map[Int, ProductDetails] = Map(
    101 -> ("Mango", 10, 25),
    102 -> ("Peach", 5, 30),
    103 -> ("Banana", 2, 45)
  )

  val inventory2: Map[Int, ProductDetails] = Map(
    102 -> ("Peach", 3, 35),
    104 -> ("Grapes", 7, 20)
  )

  def getAllProductNames(inventory: Map[Int, ProductDetails]): List[String] = {
    inventory.values.map(_._1).toList
  }

  def calculateTotalValue(inventory: Map[Int, ProductDetails]): Int = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  def isInventoryEmpty(inventory: Map[Int, ProductDetails]): Boolean = {
    inventory.isEmpty
  }

  def mergeInventories(
      inv1: Map[Int, ProductDetails],
      inv2: Map[Int, ProductDetails]
  ): Map[Int, ProductDetails] = {
    inv2.foldLeft(inv1) { case (acc, (id, (name, qty, price))) =>
      acc.get(id) match {
        case Some((_, existingQty, existingPrice)) =>
          acc + (id -> (name, existingQty + qty, Math.max(existingPrice, price)))
        case None =>
          acc + (id -> (name, qty, price))
      }
    }
  }

  def checkProductExists(
      inventory: Map[Int, ProductDetails],
      productId: Int
  ): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product with ID $productId does not exist.")
    }
  }

  // Test the functions
  println("All product names in inventory1:")
  println(getAllProductNames(inventory1))

  println("\nTotal value of all products in inventory1:")
  println(calculateTotalValue(inventory1))

  println("\nIs inventory1 empty?")
  println(isInventoryEmpty(inventory1))

  println("\nMerged inventory of inventory1 and inventory2:")
  val mergedInventory = mergeInventories(inventory1, inventory2)
  println(mergedInventory)

  println("\nCheck if product with ID 102 exists in inventory1:")
  checkProductExists(inventory1, 102)
}
