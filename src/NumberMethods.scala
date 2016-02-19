def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

println(containsNeg(List(10, 12, 4, 2, -2)))
