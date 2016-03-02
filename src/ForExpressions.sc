for (x <- List(1, 2); y <- List("one", "two"))
  yield (x, y)

case class Book(title: String, authors: String*)

val books: List[Book] =
  List(
    Book(
      "Structure and Interpretation of Computer Programs",
      "Abelson, Harold", "Sussman, Gerald J."
    ), Book(
      "Principles of Compiler Design",
      "Aho, Alfred", "Ullman, Jeffrey"
    ),
    Book(
      "Programming in Modula-2",
      "Wirth, Niklaus"
    ), Book(
      "Elements of ML Programming",
      "Ullman, Jeffrey"
    ), Book(
      "The Java Language Specification", "Gosling, James",
      "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
    )
  )

for (b <- books; a <- b.authors; if a startsWith("Gos"))
  yield b.title
