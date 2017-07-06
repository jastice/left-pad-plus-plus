import org.scalatest.FlatSpec
import works.mesh.LeftPadPlusPlus._


// please add tests
class test extends FlatSpec {

  "leftpad-plus+plus" should "pad plus left when string is shorter than n" in {
    leftPad("foo", 5) == "++foo"
  }

  "leftpad-plus+plus" should "not pad plus left when string is as long as than n" in {
    leftPad("foobar", 6) == "foobar"
  }

  "leftpad-plus+plus" should "not pad plus left if string is shorter than n" in {
    leftPad("foobarbaz", 2) == "foobarbaz"
  }

}