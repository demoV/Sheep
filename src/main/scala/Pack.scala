
class Pack(var cards: Array[Card]) {
    def draw(): Card = {
        val head: Card = cards.head
        cards = cards.drop(1)
        head
    }

    def length(): Int = cards.length

}
