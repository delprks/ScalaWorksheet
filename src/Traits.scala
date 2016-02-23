import java.nio.CharBuffer

trait Readable {
  def read(buffer: CharBuffer): Int
}

class FileReader(file: java.io.File) extends Readable with AutoCloseable {
  override def read(buffer: CharBuffer): Int = {
    val linesRead: Int = 0
    linesRead
  }

  def close(): Unit = ???
}
