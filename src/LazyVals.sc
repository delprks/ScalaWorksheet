object Demo {
  val x = { println("initializing x"); "done" }
}

Demo
Demo.x

object LazyDemo {
  lazy val x = { println("initialize x"); "done" }
}

LazyDemo
LazyDemo.x
