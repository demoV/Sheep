import scala.collection.mutable.ArrayBuffer


class Player(name: String) {
    def numberOfCards(): Int = hand.size

    var hand = ArrayBuffer.empty[Card]

    def throwCard(card: Card): Card = {
        val thrownCard: Card = hand.find(oneCard => oneCard.equals(card)).head
        hand = hand.filter(!_.equals(card))
        thrownCard
    }

    def take(card: Card) = hand += card

}
