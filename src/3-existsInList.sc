// Write a function that checks whether an element occurs in a list.

def exists[T](list: List[T], item: T): Boolean = {
  var exist = false
  var counter = 0
  val iterableList = list.toIterator

  while (!exist && counter < list.length) {
    val current = iterableList.next()

    counter += 1

    if (current == item) {
      exist = true
    }
  }

  exist
}

exists(List(2, 4, 6, 2, 3, 5), 5)
