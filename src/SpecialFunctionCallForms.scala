def echo(args: String*) =
  for(arg <- args) println(arg)

echo("Hello", "World")

val arr = Array("Hello", "World")

echo(arr: _*)

def speed(distance: Float = 50, time: Float): Float = distance / time
println(speed(time = 10, distance = 100))

println(speed(time = 50))
