// convert pences to coins

import scala.collection.immutable.ListMap
import scala.collection.mutable

val mapping: ListMap[String, Int] = ListMap(
  "2 pounds" -> 200,
  "1 pounds" -> 100,
  "50 pence" -> 50,
  "20 pence" -> 20,
  "10 pence" -> 10,
  "5 pence" -> 5,
  "2 pence" -> 2,
  "1 pence" -> 1
)

def convert(pences: Int): mutable.Map[String, Int] = {
  var mPences = pences
  val result = mutable.Map.empty[String, Int]

  mapping.foreach { coin =>
    var numOfCoins = 0

    while(mPences >= coin._2) {
      numOfCoins += 1
      result(coin._1) = numOfCoins
      mPences = mPences - coin._2
    }

  }

  result
}


convert(209)


