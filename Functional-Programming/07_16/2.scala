import scala.io.StdIn

case class Book(title: String, author: String, isbn: String)

var library: Set[Book] = Set(
  Book("Harry Potter And philosopher's stone", "JK Rowling", "12345"),
  Book("Sherlock Holmes", "Arthur Conan Doily", "54321"),
  Book("The subtle art of not giving a f", "Mark Manson", "11223")
)

def addBook(): Unit = {
    var title = StdIn.readLine("Enter book name: ")
    var author = StdIn.readLine("Enter book Author's name: ")
    var isbn = StdIn.readLine("Enter book ISBN number: ")

    var book = Book(title, author, isbn)

    library += book
}

def removeBook(isbn: String): Boolean = {
  var len1 = library.size
  library = library.filterNot(_.isbn == isbn)
  var len2 = library.size

  return if(len1 == len2) false else true
}

def containsBook(isbn: String): Boolean = {
  library.exists(_.isbn == isbn)
}

def displayLibrary(): Unit = {
  println("Library Collection:")
  library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
}

def searchByTitle(title: String): Option[Book] = {
  library.find(_.title.toLowerCase == title.toLowerCase)
}

def displayBooksByAuthor(author: String): Unit = {
  val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
  if (booksByAuthor.nonEmpty) {
    println(s"Books by $author:")
    booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
  } else {
    println(s"No books found by $author.")
  }
}

object q_2 extends App{
  addBook()

  println("\n")
  displayLibrary()

  val isbnToRemove = "97340"
  var removed = removeBook(isbnToRemove)

  if(removed)
    println(s"Book with ${isbnToRemove} number is removed\n")
  else
     println(s"Book with ${isbnToRemove} number is not found\n")

  displayLibrary()

  val titleToSearch = "Design Patterns"
  val foundBook = searchByTitle(titleToSearch)

  foundBook match {
    case Some(book) => println(s"Found book: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    case None => println(s"No book found with title '$titleToSearch'")
  }

  val authorToSearch = "JK Rowling"
  displayBooksByAuthor(authorToSearch)
}



