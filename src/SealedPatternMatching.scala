sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Int) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

def describe(e: Expr): Unit = (e: @unchecked) match {
  case Number(_) => println("a number")
  case Var(_) => println ("a var")
}

describe (Var("var_name"))
describe (Number(2))
