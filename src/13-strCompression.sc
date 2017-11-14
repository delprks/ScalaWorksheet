// compress string, eg. "aabbbdc" = "a2b3d1c1".

def compress(str: String): String = {
  var result = ""

  str.distinct.foreach { char =>
    val count = str.filter(_ == char).length
    result += char.toString + count
  }

  if (result.length > str.length) {
    str
  } else {
    result
  }
}


compress("aabbbdcccccc")
compress("abc")
