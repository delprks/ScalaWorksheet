// method to see if string has unique characters

def unique(str: String): Boolean = str.distinct.length == str.length


def unique2(str: String): Boolean = {
  var unique = true

  str.foreach { char =>
    if (str.filter(_ == char).length > 1) {
      unique = false
    }
  }

  unique
}


unique2("abcdd")

