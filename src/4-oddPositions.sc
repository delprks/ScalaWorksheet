// Write a function that returns the elements on odd positions in a list.

def findOdds(in: Array[Int]): Seq[Int] = for {
  index <- in.indices by 2
} yield in(index)


findOdds(Array(1, 2, 3, 4, 1, 4, 5))
