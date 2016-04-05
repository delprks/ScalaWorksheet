import org.json4s._

case class MyClass(id: Int) {
  lazy val blah = "lazy string"
}

class MyClassSerializer extends Serializer[MyClass] {
  private val MyClassClass = classOf[MyClass]

  def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), MyClass] = {
    case (TypeInfo(MyClassClass, _), json) => json match {
      case JObject(JField("id", JInt(id)) :: _) =>
        MyClass(id)
      case x => throw new MappingException("Can't convert " + x + " to MyClass")
    }
  }

  def serialize(implicit formats: Formats): PartialFunction[Any, JValue] = {
    case x: MyClass =>
      import JsonDSL._
      ("id" -> x.id) ~ ("blah" -> x.blah)
  }
}
