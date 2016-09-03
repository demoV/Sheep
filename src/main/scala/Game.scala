import scala.collection.mutable.ArrayBuffer

class Game {
    val players = ArrayBuffer.empty[Player]

    def numberOfPlayer: Int = players.length

    def isTableFull: Boolean = numberOfPlayer == 4

    def addPlayer(player: Player): Unit = {
        if(!isTableFull)
            players += player
    }

}
