object FactorialTailCall {
  def factorial(expected: Int): Int = {
    @annotation.tailrec
    def innerFact(a: Int, b: Int, count: Int): Int = {
      if (count == 1) {
        a
      } else if (count == 2) {
        b
      }
      else if (count == 3) {
        a + b
      } else {
        innerFact(b, a+b, count-1)
      }
    }

    val answer = innerFact(0, 1, expected)
    answer
  }

  def main(args: Array[String]): Unit = {
    val expectedValues = Array(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

    for (index <- 0 to 9) {
      println(factorial(index+1) == expectedValues(index))
    }
  }
}
