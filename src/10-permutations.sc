// given smaller string s, bigger string b, find all permutations of the shorter string in the larger string and return its position

def perm(s: String, b: String): List[Int] = {
  var pos = 0

  b.sliding(4, 1).map { chunk =>
    pos += 1
    val matches = chunk.intersect(s).length == 4
    if (matches) {
      pos
    } else {
      0
    }

  }.toList.filter(_ != 0)
}

val s = "abbc"
val b = "cbabadcbbabbcbabaabccbabc"


perm(s,  b)

