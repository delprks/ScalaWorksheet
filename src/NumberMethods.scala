def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
def containsOdd(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num % 2 == 1)
      exists = true
  exists
}

println(containsNeg(List(10, 12, 4, 2, -2)))
println(containsOdd(List(19, 10, 2)));
