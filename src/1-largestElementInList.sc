// Write a function that returns the largest element in a list.

def findLargest(in: List[Int]): Int = {
  var largest = in.head

  in.foreach { current =>
    if (current > largest) {
      largest = current
    }
  }

  largest
}

findLargest(List(3, 5, 7, 2, 1, 10, 2))
