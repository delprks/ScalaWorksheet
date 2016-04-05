case class Name(name: String)

def testingImps(greeting: String)(implicit name: Name) = println(greeting + " " + name.name)

implicit val impName = Name("Daniel")

testingImps("Hello")
