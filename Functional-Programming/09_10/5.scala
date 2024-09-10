def countLetterOccurrences(words: List[String]): Int = {
  val lengths: List[Int] = words.map(word => word.length)

  lengths.reduce((a, b) => a + b)
}

object q5 extends App {
  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(words)
  println(s"Total count of letter occurrences: $totalCount")
}
