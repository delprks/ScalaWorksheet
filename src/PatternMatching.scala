def listAnalysis(list: List[Any]) = list match {
  case Nil => "Empty"
  case "a" :: tail => "starts with 'a'"
  case (head:Int) :: _ if head > 3 => "starting by an int greater than 3"
  case (head:Int) :: _ => "starting by an int"
  case _ => "Whatever"
}

val list = List(5, "b", "a")

println(listAnalysis(list))
