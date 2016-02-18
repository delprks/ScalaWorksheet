import java.io.File

object FileMatcher {
  private def filesHere = new File(".").listFiles()

  def filesEnding(query: String) =
    fileMatching(_.endsWith(query))

  def fileContains(query: String) =
    fileMatching(_.contains(query))

  def fileMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }
}

val filesEndWith = FileMatcher.filesEnding(".scala")

println(filesEndWith.toList)

val filesContain = FileMatcher.fileContains("File")

println(filesContain.toList)
