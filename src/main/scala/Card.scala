

class Card(suit: String, rank: Int) {
    private def cardSuit: String = suit

    private def cardRank = rank

    def isGreaterThan(other: Card): Boolean = rank > other.cardRank

    def equals(obj: Card): Boolean = rank == obj.cardRank && suit.equals(obj.cardSuit)

}
