// Write a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,

def alternate(listOne: List[Any], listTwo: List[Any]): List[Any] = {
  listOne.zip(listTwo)
}

val listOne = List(1, 2, 3)
val listTwo = List("one", "two", "three")

alternate(listOne, listTwo)
