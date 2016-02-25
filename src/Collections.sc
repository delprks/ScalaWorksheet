import scala.collection.mutable.ListBuffer

val fiveInts = Array[Int](5)
fiveInts.head

val fiveToOne: Array[Int] = Array(1, 2, 3, 4, 5)

val bufferList: ListBuffer[Int] = new ListBuffer[Int]

bufferList += 1
bufferList += 2
3 +=: bufferList

bufferList.toList

