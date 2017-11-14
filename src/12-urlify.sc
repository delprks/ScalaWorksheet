// replace spaces with %20

def urlify(str: String, rep: String = "%20"): String =
  str.trim.replace(" ", rep)


urlify(" Mr John Smith         ")

