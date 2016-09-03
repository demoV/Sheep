import org.scalatest.FunSuite

class GameTest extends FunSuite{
    test("should be able to add player in game") {
        val game: Game = new Game()
        val player: Player = new Player("name")
        game.addPlayer(player)
        assertResult(1)(game.numberOfPlayer)

        val anotherPlayer: Player = new Player("one")
        game.addPlayer(anotherPlayer)
        assertResult(2)(game.numberOfPlayer)
    }

    test("should not add player more than 4") {
        val game: Game = new Game()

        val player: Player = new Player("name")
        val anotherPlayer: Player = new Player("one")
        val thirdPlayer: Player = new Player("third")
        val fourthPlayer: Player = new Player("fourth")

        game.addPlayer(player)
        game.addPlayer(anotherPlayer)
        game.addPlayer(thirdPlayer)
        game.addPlayer(fourthPlayer)

        assertResult(4)(game.numberOfPlayer)

        val fifthPlayer: Player = new Player("fifth")
        game.addPlayer(fifthPlayer)

        assertResult(4)(game.numberOfPlayer)
    }
}
