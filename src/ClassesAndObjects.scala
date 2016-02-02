class Customer(val name: String, val address: String) {
  private var _id = ""

  def id = _id

  def id_=(value: String) {
    if (_id.isEmpty) {
      _id = value
    }
  }
}

object Customer {
  def main(args: Array[String]): Unit = {
    val dan = new Customer("Daniel", "Somewhere Street")
    dan.id = "001"
    println("before " + dan.id)
    dan.id = "002"
    println("after " + dan.id)
  }
}
