import java.io.File

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
