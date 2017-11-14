// Write a function that computes the running total of a list.


def total(list: List[Int]): Int = {
  var total = 0

  list.foreach(total += _)

  total
}



total(List(1, 2, 3, 4))

