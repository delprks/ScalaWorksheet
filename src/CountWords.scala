import scala.collection.mutable

def countWords(text: String) = {
  val countMap = mutable.Map.empty[String, Int]

  for (rawWord <- text.split("[ ,!.]+")) {
    val word = rawWord.toLowerCase

    val oldCount = if (countMap.contains(word))
      countMap(word)
      else 0

    countMap += (word -> (oldCount + 1))
  }

  countMap
}

println(countWords("See Spot run! Run, Spot. Run!"))
