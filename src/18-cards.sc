trait Card {
  val kind: String
}

case class FaceCard(face: String, kind: String) extends Card
case class NumberCard(value: Int, kind: String) extends Card

class DeckOfCards {
  private final val Faces = List("Ace", "King", "Queen", "Jack")
  private final val Kinds = List("Diamonds", "Spade", "Hearts", "Clubs")

  private val faceCards = for {
    face <- Faces
    kind <- Kinds
  } yield FaceCard(face = face, kind = kind)

  private val numberCards = for {
    kind <- Kinds
    number <- 2 to 10
  } yield NumberCard(value = number, kind = kind)

  lazy val cards = faceCards ++ numberCards

  def shuffle = scala.util.Random.shuffle(cards)

}

val deckOfCards = new DeckOfCards

deckOfCards.shuffle
