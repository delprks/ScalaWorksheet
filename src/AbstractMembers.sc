trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}

class Concrete extends Abstract {
  type T = String
  def transform(x: T): T = x + x
  val initial: T = "Hi"
  var current: T = initial
}

val concrete = new Concrete
println(concrete.transform("Hello!"), concrete.current)
