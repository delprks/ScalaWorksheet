import scala.collection.immutable.{TreeMap, TreeSet}
import scala.collection.mutable
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

val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,. ]+")

val words = mutable.Set.empty[String]

for (word <- wordsArray)
  words += word.toLowerCase

words.toList

val nums = Set(1, 2, 3)
nums + 5
nums + 6
nums - 3

nums ++ List(4, 5, 6)

nums & Set(3, 1, 4, 5)

nums.size

nums.contains(4)
nums.contains(3)

val map = mutable.Map.empty[String, Int]

map("hello") = 1
map("there") = 2

map

val treeSet = TreeSet(3,5,6,4,2,1)
val strTreeSet = TreeSet("a", "e", "b", "c")

val treeMap = TreeMap(5 -> "there", 1 -> "xpv")

val colors = Set("blue", "red", "green")

val orderedColors = TreeSet[String]() ++ colors
