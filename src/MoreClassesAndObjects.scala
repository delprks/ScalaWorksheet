class Customer2(forename: String, initial: String = "", surname: String) {
  val fullname = if(initial != null && !initial.isEmpty)
    forename + " " + initial + ". " + surname
  else
    forename + " " + surname
}

object Customer2 {
  def main(args: Array[String]): Unit = {
    val mic = new Customer2("Mic", "M", "Anderson")

    println(mic.fullname)

    val mic2 = new Customer2("Dan", surname = "Parks")

    println(mic2.fullname)
  }
}
