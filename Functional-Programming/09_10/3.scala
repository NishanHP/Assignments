class Account(private var balance: Double) {
  require(balance >= 0, "Initial balance cannot be negative")

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(amount <= balance, "Insufficient balance for transfer")
    withdraw(amount) 
    toAccount.deposit(amount)
  }

  def getBalance: Double = balance

  override def toString: String = f"Account(balance: $$${balance}%.2f)"
}

object q3 extends App {
  val account1 = new Account(700.0) 
  val account2 = new Account(200.0) 

  println(account1) 
  println(account2) 

  account1.deposit(200.0) 
  println(account1) 

  account1.withdraw(50.0)  
  println(account1) 

  account1.transfer(400.0, account2)  
  println(s"after transfer account 1 " + account1) 
  println(s"after transfer account2 " + account2) 
}
