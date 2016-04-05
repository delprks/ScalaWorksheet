case class Name(name: String)

def sayGreeting(greeting: String)(implicit name: Name) = println(greeting + " " + name.name)

implicit val impName = Name("Daniel")

sayGreeting("Hello")
