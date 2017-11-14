// Write a function that tests whether a string is a palindrome.

def palin(in: String): Boolean = {
  val (left, right) = in.splitAt(in.length / 2)

  val normedRight = {
    val co = if (right.length > left.length) {
      right.drop(1)
    } else {
      right
    }

    co.reverse
  }

  left == normedRight
}

palin("maeeeram")

val str = "madam"

