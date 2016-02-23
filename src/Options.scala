def hello(name: Option[String]) = s"Hello ${name getOrElse "stranger" toUpperCase}"

def a(name: String) = hello(Option(name))
def b(name: String) = hello(Some(name))

println(a(null))
println(b("Dan"))
