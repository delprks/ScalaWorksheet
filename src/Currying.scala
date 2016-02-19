def normalSum(num1: Int, num2: Int) = num1 + num2
def curriedSum(x: Int)(y: Int) = x + y
val onePlus = curriedSum(1)_
val normalOnePlus = normalSum(1, _: Int)

println(normalSum(2, 3))
println(curriedSum(1)(2))
println(normalOnePlus(4))
