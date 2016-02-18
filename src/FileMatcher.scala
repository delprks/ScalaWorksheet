import java.io.File

object FileMatcher {
  private def filesHere = new File(".").listFiles()

  def filesEnding(query: String) =
    fileMatching(query, _.endsWith(_))

  def fileContains(query: String) =
    fileMatching(query, _.contains(_))

  def fileMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }
}

val filesEndWith = FileMatcher.filesEnding(".scala")

println(filesEndWith.toList)

val filesContain = FileMatcher.fileContains("File")

println(filesContain.toList)
