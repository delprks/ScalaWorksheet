class Queue[T] private (private val leading: List[T], private val trailing: List[T]) {
  def returnList = leading
}

object Queue {
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}

println(Queue(1, 2, 3).returnList)
