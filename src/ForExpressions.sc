val longTitle = "BBC Radio One"
val pattern = "[^BBC ]\\w".r

val shortTitle = pattern.findFirstIn(longTitle).get

val shorterTitle = {val titleArr = longTitle.split(" "); if (titleArr(0) == "BBC") titleArr.drop(1).mkString(" ") else longTitle}



abstract case class Programme private(typ: String)
case class episode(typ: String, value: String)

object Programme {
  def apply(typ: String) = {
    if (typ == "episode")
      episode(typ, "some additional value")
  }
}

val testing = Programme("episode")

