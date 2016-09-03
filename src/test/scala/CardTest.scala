import org.scalatest.FunSuite

class CardTest extends FunSuite{
    test("should be able to compare with other card") {
        val twoOfDiamond: Card = new Card("Diamond", 2)
        val threeOfDiamond: Card = new Card("Diamond", 3)
        assert(threeOfDiamond.isGreaterThan(twoOfDiamond))
    }
}
