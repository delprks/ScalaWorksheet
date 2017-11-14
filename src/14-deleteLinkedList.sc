trait LinkedList[+A];

class LinkedItem[A](var head: A, var tail: LinkedList[A]) extends LinkedList[A]
class NullItem extends LinkedList[Nothing]

class Tree[A] {
  var nodes: LinkedList[A] = new NullItem

  def add(node: LinkedList[A]): Unit = {
    if (nodes.isInstanceOf[NullItem]) {
      nodes = node
    } else {
      var currentTail = nodes.asInstanceOf[LinkedItem[A]].tail
      while (!currentTail.isInstanceOf[NullItem]) {
        val currentNode = currentTail
      }

      nodes.asInstanceOf[LinkedItem[A]].tail = node
    }
  }

}

val tree = new Tree[Int]

val node1 = new LinkedItem[Int](1, new NullItem)

tree.add(node1)

tree.nodes.asInstanceOf[LinkedItem[Int]].head

val node2 = new LinkedItem[Int](2, new NullItem)

tree.add(node2)

tree.nodes.asInstanceOf[LinkedItem[Int]].tail.asInstanceOf[LinkedItem[Int]].head


tree.nodes
