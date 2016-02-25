import scala.collection.mutable.{ArrayBuffer, ListBuffer}

val fiveInts = Array[Int](5)
fiveInts.head

val fiveToOne: Array[Int] = Array(1, 2, 3, 4, 5)

val bufferList: ListBuffer[Int] = new ListBuffer[Int]

bufferList += 1
bufferList += 2
3 +=: bufferList

bufferList.toList

val bufferedArray: ArrayBuffer[Int] = new ArrayBuffer[Int]()

bufferedArray += 1
bufferedArray += 2
3 +=: bufferedArray

bufferedArray(0)
bufferedArray.length

def hasUpperCase(s: String) = s.exists(_.isUpper)

hasUpperCase("This has upper case letters")
hasUpperCase("this doesn't have upper case letters")
