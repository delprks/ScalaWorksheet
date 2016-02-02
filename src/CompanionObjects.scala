class Customer3 private (val name: String, val address: String) {
  private val id = Customer3.nextId()
  val info = String.format("%s, residing at %s", name, address)
}

object Customer3 {
  def apply(name: String, address: String) = new Customer3(name, address) // this is one of uses of companion objects: factory methods

  def main(args: Array[String]): Unit = {
    val customer = Customer3("Bob", "London") // this is same as Customer3.apply(...) scala looks for apply method automatically
    println(customer.info)
  }

  private var sequenceOfIds = 0

  private def nextId() = {
    sequenceOfIds += 1
    sequenceOfIds
  }
}