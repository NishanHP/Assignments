def numOfPeople(ticketPrice: Int): Int = {
  return 120 + (15 - ticketPrice) / 5 * 20
}

def cost(numOfPeople: Int): Int = {
  return 500 + 3 * numOfPeople
}

def revenue(ticketPrice: Int): Int = {
  return ticketPrice * numOfPeople(ticketPrice);
}

def profit(ticketPrice: Int): Int = {
  return revenue(ticketPrice) - cost(numOfPeople(ticketPrice));
}

def printVal() = {
  for (i <- -2 to 3) {
    println("ticket price " + (15 + i * 5) + " : " + profit(15 + (i * 5)));
  }
}
