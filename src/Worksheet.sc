def formatArgs(args: Array[String]) = args.mkString(", ")
val res = formatArgs(Array("one", "two"))

assert(res == "one, two")


//(0 to 100).foreach(println(_))
val map = Map("name" -> "daniel", "address" -> "52 Somewhere")

def sayHello(name: String): String = {
  "hello " + name
}

sayHello("Daniel!")

class HelloFactory(name: String) {
  def format() = {
    (0 to 5).foreach(println(_))
  }
}

object HelloFactory {
  def main(args: Array[String]) = {
    val factory = new HelloFactory("Dan")
    factory.format()
  }
}

val myArr = new Array[String](3)

myArr(0) = "Hello"
myArr(1) = ", "
myArr(2) = "there"

for (i <- 0 to 2)
  print(myArr(i))

val twoThree = List(2, 3)
println(twoThree)

val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val combined = oneTwoThree ::: twoThree
print(combined)

val shortList = 1 :: 2 :: 3 :: Nil

shortList(2)

val stringList = "dan" :: "test" :: "scala" :: Nil
stringList.count(s => s.length == 3) //returns number of elements with length of 3

stringList.drop(2)
stringList.dropRight(1)
stringList.exists(s => s == "dan")
stringList.foreach(s => println(s))
stringList.foreach(println)
stringList.mkString(", ")

val myTuples = (99, "some string")
println(myTuples._2)

var immutableSet = Set("one", "two")
immutableSet += "three"
println(immutableSet)

import scala.collection.immutable.HashSet

val hashSet = HashSet("some", "tomatoes")
println(hashSet + "corriander")

import scala.collection.mutable.Map
val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "dig a hole")
treasureMap += (3 -> "find treasure")
println (treasureMap(2))


