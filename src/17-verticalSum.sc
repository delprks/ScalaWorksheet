import scala.collection.mutable

case class Node(value: Int, left: Option[Node] = None, right: Option[Node] = None)

def sum(node: Node, hd: Int = 0, res: mutable.HashMap[Int, Int] = mutable.HashMap[Int, Int]()): mutable.HashMap[Int, Int] = {
  res.put(hd, res.getOrElse(hd, 0) + node.value)

  if (node.left.nonEmpty && node.right.nonEmpty) {
    sum(node.left.get, hd - 1, res)
    sum(node.right.get, hd + 1, res)
  }

  res
}

val tree = Node(value = 1,
  left = Some(Node(value = 2,
    left = Some(Node(value = 4)),
    right = Some(Node(value = 5))
  )),
  right = Some(Node(value = 3,
    left = Some(Node(value = 6)),
    right = Some(Node(value = 7))
  ))
)

sum(tree)
