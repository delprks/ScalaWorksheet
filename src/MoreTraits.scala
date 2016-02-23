trait Philosophical {
  def philosophize(): Unit = {
    println("I am!")
  }
}

class Frog extends Philosophical {
  override def toString = "green"
}

val frog = new Frog
frog.philosophize()

val phil: Philosophical = frog
phil.philosophize()
