class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer:Int = n
  val denom:Int = d
  override def toString = n + "/" + d
  def add(that: Rational): Rational = new Rational(
    numer * that.denom + that.numer * denom, denom * that.denom
  )
}

object Rational {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println(oneHalf add twoThirds)
  }
}
