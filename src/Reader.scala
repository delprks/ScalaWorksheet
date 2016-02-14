def reader(filename: String): Unit = {
  val source = scala.io.Source.fromFile(filename)

  for (line <- source.getLines()) {
    println(line)
  }
}

reader("Rational.scala")
