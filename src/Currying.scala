def normalSum(num1: Int, num2: Int) = num1 + num2
def curriedSum(x: Int)(y: Int) = x + y
val onePlus = curriedSum(1)_

println(normalSum(2, 3))
println(curriedSum(1)(2))
println(onePlus(3))
