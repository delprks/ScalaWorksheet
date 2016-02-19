def containsNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}

println(containsNeg(List(10, 12, 4, 2, -2)))
