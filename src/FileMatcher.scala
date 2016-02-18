import java.io.File

object FileMatcher {
  private def filesHere = new File(".").listFiles()

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def fileContains(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file
}

val filesEndWith = FileMatcher.filesEnding(".scala")

println(filesEndWith.toList)

val filesContain = FileMatcher.fileContains("File")

println(filesContain.toList)
