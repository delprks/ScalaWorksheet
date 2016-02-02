class Customer5(val name: String, val address: String) {
  private final val basket: ShoppingBasket = new ShippingBasket

  def add(item: Item): Unit = {
    basket.add(item)
  }

  def total: Double = {
    basket.value
  }
}

class DiscountedCustomer(name: String, address: String) extends Customer5(name, address) {
  override def total: Double = {
    super.total * 0.90
  }
}

object DiscountedCustomer {
  def main(args: Array[String]): Unit = {
    val joe = new DiscountedCustomer("Joe", "128 Somewhere Road")
    joe.add(new Item{
      def price = 2.5
    })

    println("Joe's basket will cost £" + joe.total)
  }
}
