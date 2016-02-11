import java.io.{FileNotFoundException, FileReader, File}

val test = if (args.nonEmpty) args(0) else "default"

println(test)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val filesHere = new File(".").listFiles()

for {
  file <- filesHere
  if file.getName.endsWith(".scala")
  line <- fileLines(file)
  trimmed = line.trim
  if trimmed.matches(".*filesHere.*")
} println(file + ": " + line.trim)

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

println(scalaFiles.toList)

val n = 6

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be 0")

println(half)

try {
  val f = new FileReader("Traits.scalad")
  println(f.toString)
} catch {
  case ex: FileNotFoundException => println("file was not found")
  case ex: java.io.IOException =>
}
