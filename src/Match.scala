val arg = args(0)

arg match {
  case "salt" => println("pepper")
  case _ => println("invalid. type salt")
}

val result = arg match {
  case "salt" => "you typed salt!"
}

println(result)
