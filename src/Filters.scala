val myList = List(1, 2, 3, 4)
myList.filter((x: Int) => x > 2).foreach((x: Int) => println(x))

myList.filter(_ > 2).foreach(println(_)) //using placeholders
