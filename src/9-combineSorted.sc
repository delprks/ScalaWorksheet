import scala.collection.immutable.HashMap
// Write a function that merges two sorted lists into a new sorted list. [1,4,6],[2,3,5] → [1,2,3,4,5,6]. You can do this quicker than concatenating them followed by a sort.
//
//def sort(listOne: List[Int], listTwo: List[Int]) = {
//  for {
//    l1 <- listOne
//  } yield {
//    if (l1 < l2) {
//      l1
//    } else {
//      l2
//    }
//  }
//}

val listOne = List(1, 4, 6)
val listTwo = List(2, 3, 5)
val listTwoI = listTwo.toIterator

val listTwoBuff = scala.collection.mutable.ListBuffer.empty[Int]
listTwo.copyToBuffer(listTwoBuff)

listOne.map { l1 =>
  listTwo.takeWhile(l2 => l1 < l2)
}


val hashMap = HashMap[Int, String]()


