val capitals = Map("France" -> "Paris", "UK" -> "London")
capitals get "France"
capitals get "UK"
capitals get "Invalid"

def show(x: Option[String]) = x match {
  case Some(capital) => s"capital is $capital"
  case None => "?"
}

show(capitals get "France")
show(capitals get "invalid")

val myTuple = (123, "abc")
val (number, string) = myTuple

println(string)

val second: List[Int] => Int = {
  case x :: y :: _ => y
}

second(List(1, 2, 3))

for ((country, city) <- capitals)
  println(s"capital of $country is $city")

val results = List(Some("apple"), None, Some("orange"))

for (Some(fruit) <- results) println(fruit)

