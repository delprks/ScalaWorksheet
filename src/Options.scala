def hello(name: Option[String]) = s"Hello ${name getOrElse "stranger" toUpperCase}"

def a(name: String) = hello(Option(name))
def b(name: String) = hello(Some(name))

//println(a(null))
//println(b("Dan"))

case class User(id: Int, firstName: String, lastName: String, gender: Option[String])

object UserRepository {
  private val users = Map(
    1 -> User(1, "Mike", "Peters", Some("M")),
    2 -> User(2, "Jo", "Williams", None)
  )

  def findById(id: Int): Option[User] = users.get(id)
  def findAll() = users.values
}

val user = UserRepository.findById(1)

println("gender of user is " + user.get.gender.getOrElse("not specified"))

// different way, using matching:

user.get.gender match {
  case Some(gender) => println(s"Gender is $gender")
  case None => println("Gender not specified")
}
