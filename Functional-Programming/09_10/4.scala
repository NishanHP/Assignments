class Account(private var balance: Double) {
  require(balance >= -1000, "Initial balance cannot be less than -1000")

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance + 1000, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(amount <= balance + 1000, "Insufficient balance for transfer")
    withdraw(amount) 
    toAccount.deposit(amount) 
  }

  def getBalance: Double = balance

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05 
    } else {
      balance -= balance * 0.10 
    }
  }

  override def toString: String = f"Account(balance: $$${balance}%.2f)"
}

class Bank(private var accounts: List[Account]) {

  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAllAccounts(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  override def toString: String = accounts.mkString("\n")
}

// Example usage
object q4 extends App {
  val account1 = new Account(1000.0)  
  val account2 = new Account(-500.0)   
  val account3 = new Account(1500.0)  
  val account4 = new Account(-300.0)  

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  println(bank.accountsWithNegativeBalances.mkString("\n"))

  println(f"\nTotal balance: $$${bank.totalBalance}%.2f")

  bank.applyInterestToAllAccounts()
  println("\nFinal balances after applying interest:")
  println(bank)
}
