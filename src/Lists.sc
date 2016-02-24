val fruits: List[String] = List("apple", "orange", "banana")
val nothing: List[Nothing] = List()

for (fruit <- fruits)
  println(fruit)

println(fruits.head)
println(fruits.tail)
println(fruits.tail.head)
println(fruits.isEmpty)
println(nothing.isEmpty)

val List(apple, orange, banana) = fruits
println(s"$apple $orange $banana")

// if you don't know list length
val a :: b :: rest = fruits

