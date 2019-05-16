import scala.reflect.ClassTag

object Test {
  def main(args: Array[String]): Unit = {

    def testArray[T: ClassTag](n: Int, elem: Int => T): Unit = {
      val t: Tuple = Tuple.fromArray(Array.tabulate(n)(elem))
      assert(n == t.size)
    }

    for (i <- 0 to 25)
      testArray(i, j => j)

    assert(1 == Tuple1(1).size)
    assert(2 == (1, 2).size)
    assert(3 == (1, 2, 3).size)
    assert(4 == (1, 2, 3, 4).size)
    assert(5 == (1, 2, 3, 4, 5).size)
    assert(6 == (1, 2, 3, 4, 5, 6).size)
    assert(7 == (1, 2, 3, 4, 5, 6, 7).size)
    assert(8 == (1, 2, 3, 4, 5, 6, 7, 8).size)
    assert(9 == (1, 2, 3, 4, 5, 6, 7, 8, 9).size)
    assert(10 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).size)
    assert(11 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).size)
    assert(12 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).size)
    assert(13 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).size)
    assert(14 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).size)
    assert(15 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).size)
    assert(16 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16).size)
    assert(17 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17).size)
    assert(18 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18).size)
    assert(19 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19).size)
    assert(20 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).size)
    assert(21 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21).size)
    assert(22 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22).size)
    assert(23 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23).size)
    assert(24 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24).size)
    assert(25 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25).size)

    assert(1 == (1 *: ()).size)
    assert(2 == (1 *: 2 *: ()).size)
    assert(3 == (1 *: 2 *: 3 *: ()).size)
    assert(4 == (1 *: 2 *: 3 *: 4 *: ()).size)
    assert(5 == (1 *: 2 *: 3 *: 4 *: 5 *: ()).size)
    assert(6 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: ()).size)
    assert(7 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: ()).size)
    assert(8 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: ()).size)
    assert(9 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: ()).size)
    assert(10 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: ()).size)
    // FIXME performace
//    assert(11 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: ()).size)
//    assert(12 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: ()).size)
//    assert(13 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: ()).size)
//    assert(14 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: ()).size)
//    assert(15 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: ()).size)
//    assert(16 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: ()).size)
//    assert(17 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: ()).size)
//    assert(18 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: ()).size)
//    assert(19 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: ()).size)
//    assert(20 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: ()).size)
//    assert(21 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: ()).size)
//    assert(22 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: ()).size)
//    assert(23 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: ()).size)
//    assert(24 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: ()).size)
//    assert(25 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: 25 *: ()).size)
  }
}
