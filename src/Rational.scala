class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer:Int = n
  val denom:Int = d
  override def toString = n + "/" + d

  def this(n: Int) = this(n, 1) // auxiliary constructor

  def +(that: Rational): Rational = new Rational(
    numer * that.denom + that.numer * denom, denom * that.denom
  )

  def + (i: Int): Rational = new Rational(numer + i * denom, denom)

  def < (that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this < that) that else this
}

object Rational {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val five = new Rational(5)

    println(oneHalf + twoThirds)
    println(oneHalf < twoThirds)
    println(oneHalf max twoThirds)
    println(five)
    println(oneHalf + 4)
  }
}
