import scala.io.StdIn.readLine

object StudentRecords extends App {

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (!marks.forall(_.isDigit) || !totalMarks.forall(_.isDigit)) {
      (false, Some("Marks and total possible marks must be positive integers."))
    } else if (marks.toInt < 0 || totalMarks.toInt <= 0) {
      (false, Some("Marks and total possible marks must be greater than 0."))
    } else if (marks.toInt > totalMarks.toInt) {
      (false, Some("Marks cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student name: ")
    val name = readLine()
    println("Enter marks obtained: ")
    val marks = readLine()
    println("Enter total possible marks: ")
    val totalMarks = readLine()

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

    if (!isValid) {
      println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}")
      getStudentInfo()
    } else {
      val marksInt = marks.toInt
      val totalMarksInt = totalMarks.toInt
      val percentage = (marksInt.toDouble / totalMarksInt) * 100
      val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
      (name, marksInt, totalMarksInt, percentage, grade)
    }
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')

    while (!isValid) {
      println("Enter student name: ")
      val name = readLine()
      println("Enter marks obtained: ")
      val marks = readLine()
      println("Enter total possible marks: ")
      val totalMarks = readLine()

      val (valid, errorMessage) = validateInput(name, marks, totalMarks)
      if (!valid) {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}")
      } else {
        val marksInt = marks.toInt
        val totalMarksInt = totalMarks.toInt
        val percentage = (marksInt.toDouble / totalMarksInt) * 100
        val grade = percentage match {
          case p if p >= 90 => 'A'
          case p if p >= 75 => 'B'
          case p if p >= 50 => 'C'
          case _ => 'D'
        }
        studentInfo = (name, marksInt, totalMarksInt, percentage, grade)
        isValid = true
      }
    }
    studentInfo
  }

  // Main execution
  val studentRecord = getStudentInfoWithRetry()
  printStudentRecord(studentRecord)
}
