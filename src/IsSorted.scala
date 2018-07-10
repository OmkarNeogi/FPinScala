import scala.annotation.tailrec

object IsSorted {
  def isSorted[A](nums: Array[A], ordered: (A, A) => Boolean): Boolean = {
    isSortedPrivate(nums, 1, ordered)
  }

  @tailrec
  def isSortedPrivate[A](nums: Array[A], index: Int, ordered: (A, A) => Boolean): Boolean = {
    if (index == nums.length) {
      return true
    }
    if (ordered(nums(index), nums(index-1))) {
      false
    } else {
      isSortedPrivate(nums, index+1, ordered)
    }
  }

  def main(args: Array[String]): Unit = {
    val array = Array(-1,1,1,2,2,3,4)
    def isOrdered(num1: Int, num2: Int): Boolean = {
      num1 < num2
    }

    print(isSorted(array, (x: Int, y: Int) => x < y))
  }
}
