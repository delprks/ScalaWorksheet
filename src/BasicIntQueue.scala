import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = super.put(x * 2)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  def get() = buf.remove(0)
  def put(x: Int) = buf += x
  def show() = buf.toList
}

class MyQueue extends BasicIntQueue with Doubling

val intQueue = new BasicIntQueue

intQueue.put(2)
intQueue.put(4)

println(intQueue.show())

val myQueue = new MyQueue

myQueue.put(6)
myQueue.put(8)

println(myQueue.show())
