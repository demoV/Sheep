import org.scalatest.FunSuite

class PackTest extends FunSuite{
    test("should give the number of cards in pack") {
        val card: Card = new Card("Spades", 4)
        val cards: Array[Card] = Array(card)
        val pack: Pack = new Pack(cards)
        assertResult(1)(pack.length())
    }
    test("should be able to draw a card") {
        val card: Card = new Card("Spades", 4)
        val cards: Array[Card] = Array(card)
        val pack: Pack = new Pack(cards)
        val drawnCard: Card = pack.draw()
        assertResult(drawnCard)(card)
        assertResult(0)(pack.length())
    }
}
