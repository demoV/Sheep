import org.scalatest.FunSuite

class PlayerTest extends FunSuite{
    test("should able to take a card and can also throw a card") {
        val bot: Player = new Player("Bot")
        val card: Card = new Card(CardSuits.DIAMONDS, 8)
        bot.take(card)
        val thrownCard: Card  = bot.throwCard(card)
        assertResult(thrownCard)(card)
        assertResult(0)(bot.numberOfCards())
    }
}
