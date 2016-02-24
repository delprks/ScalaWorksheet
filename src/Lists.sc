import scala.collection.concurrent.RDCSS_Descriptor

val fruits: List[String] = List("apple", "orange", "banana")
val nothing: List[Nothing] = List()

for (fruit <- fruits)
  println(fruit)
println(fruits.head)
println(fruits.tail)
println(fruits.tail.head)
println(fruits.isEmpty)
println(nothing.isEmpty)
val List(apple, orange, banana) = fruits
println(s"$apple $orange $banana")
// if you don't know list length
val a :: b :: rest = fruits
List(1, 2) ::: List(3, 4, 5)
def append[String](xs: List[String], ys: List[String]): List[String] = xs match {
  case List() => ys
  case x :: xs1 => x :: append(xs1, ys)
}
append(List("first", "second"), List("third"))
fruits.length
fruits.last
fruits.init
val strList: List[String] = List("c", "b", "a")
strList.reverse
List("a", "b", "c", "d") take 2
List("a", "b", "c", "d") drop 2
List("a", "b", "c", "d") splitAt 2

List("a", "b", "c", "d") apply 2
List("a", "b", "c", "d").indices
val listOfLists = List(List(1, 2), List(3, 4), List(5, 6))
listOfLists.flatten
fruits.map(_.toCharArray).flatten
fruits.flatMap(_.toCharArray)
fruits.indices zip fruits
//similar to:
val zipped = fruits.zipWithIndex
zipped.unzip
listOfLists.toString()
fruits.toString()
fruits mkString("before ", ", ", " end")
fruits.toArray
val fruitsArr: Array[String] = Array("banana", "kiwi")
fruitsArr.toList
val arr: Array[Int] = Array[Int](10)
val addList: List[Int] = List(1, 2, 3)
addList copyToArray(arr, 3)

val newArr = arr.iterator
newArr.next()
val numericalList: List[Int] = List(1, 2, 3, 4, 5, 6)
numericalList map(_ + 1)
val stringList: List[String] = List("the", "quick", "brown", "fox")
stringList map(_ toUpperCase())
stringList map(_.toList.reverse.mkString)
var sum: Int = 0
List(1, 2, 3, 4) foreach(sum += _)
println(sum)

val filteredList: List[Int] = numericalList filter (_ > 2)
println(filteredList)

val evenList: List[Int] = numericalList filter (_ % 2 == 0)

val oddAndEven: (List[Int], List[Int]) = numericalList partition (_ % 2 == 0)

val firstEven: Option[Int] = numericalList find (_ % 2 == 0)

firstEven match {
  case Some(x) => s"found $x"
  case None => "didn't find anything"
}

val lessThanFiveList: List[Int] = numericalList takeWhile(_ < 5)

val startsWithB: List[String] = stringList dropWhile (_ startsWith("t"))

val variedNumList: List[Int] = List(1, 2, 3, -4, -5)

val spannedList: (List[Int], List[Int]) = variedNumList span(_ > 0)

variedNumList forall(_ > 3)
variedNumList exists(_ < 3)

def sum(xs: List[Int]): Int = (4 /: xs) (_ + _) // adds 4 to the beginning

sum(numericalList)

("the result is: " /: stringList) (_ + " " + _)

//without the space at the beginning:
(stringList.head /: stringList.tail) (_ + " " + _)

val revSortedList: List[Int] = numericalList sortWith(_ > _)

val sortedStrList: List[String] = stringList sortWith(_.length < _.length)

List.range(1, 5)

List.range(1, 5, 2)

List.range(5, 1, -2)
