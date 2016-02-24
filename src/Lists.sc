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

