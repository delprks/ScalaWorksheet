def listAnalysis(list: List[Any]) = list match {
  case Nil => "Empty"
  case "a" :: tail => "starts with 'a'" //tail is just a name, could've written as case 'a' :: _ => "starting by 'a'"
  case (head:Int) :: _ if head > 3 => "starting by an int greater than 3"
  case (head:Int) :: _ => "starting by an int"
  case _ => "Whatever"
}

println(listAnalysis(List()))                             //> java.lang.String = empty
println(listAnalysis("This is a test".toList))            //> java.lang.String = whatever
println(listAnalysis("abcde".toList))                     //> java.lang.String = starting by 'a'
println(listAnalysis(List(1,2,3)))                        //> java.lang.String = starting by an int
println(listAnalysis(List(42,24,36)))                     //> java.lang.String = starting by an int greater than 3
println(listAnalysis("a".toList))                         //> java.lang.String = starting by 'a'
