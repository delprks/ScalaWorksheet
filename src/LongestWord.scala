def longestWord(words: Array[String]) = {
  var word = words(0)
  var index = 0

  for (i <- 1 until words.length) {
    if (words(i).length > word.length) {
      word = words(i)
      index = i
    }
  }

  (word, index)
}

val (word, index)  = longestWord("The quick brown fox".split(" "))

println(s"longest word is $word with index of $index")
