// Write function that reverses a list, preferably in place.

def reverse(in: List[Int]) = {
  val inArray = in.toArray

  val outArray = for {
    index <- inArray.length -1 to 0 by -1
  } yield inArray(index)

  outArray.toList
}


reverse(List(2 ,3, 5))

