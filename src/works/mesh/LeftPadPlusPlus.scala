package works.mesh

object LeftPadPlusPlus {

  def leftPad(str: String, n: Int): String = {
    val padding = Math.max(n-str.length, 0)
    "+" * padding + str
  }

}