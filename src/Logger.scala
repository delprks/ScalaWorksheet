import java.util.logging.Level

object Logger {
  def log(level: Level, string: String): Unit = {
    printf("%s %s%n", level, string)
  }

  def main(args: Array[String]): Unit = {
    Logger.log(Level.INFO, "Scala version")
  }
}
