case class Available(available: String, name: String)

val avList: List[Available] = List(Available("pending", "mobile"), Available("available", "sky"), Available("available", "pc"))
val avPriorities: List[String] = List("past")

val newWorks = avPriorities.flatMap(x => avList.find(_.available == x))
