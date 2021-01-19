object Test with

  locally {
    var x = 0
    while x < 10 do x += 1
    val f = 10
    while
      x += 1
      x < 10
    do ()
  }

  def f(x: Int): Int =
    val y =
      if x > 0 then
        println("hello")
        22
      else
        println("world")
        33
    val y1 =
      if x > 0 then
        1
      else
        2
    val y2 =
      if (y > 0) && y < 0 then
        1
      else
        2
    extension (x: Int) def gt(y: Int) = x > y
    val y3 =
      if (1) max 10 gt 0

      then
        1
      else
        2
    if (true) println (2)
    val z = 22
    x + y + z
  end f

  def g = "!"

  val xs = List(1, 2, 3)

  xs.map {
    x =>
      val y = x * x
      y * y
  }

  val gg = (x: Int) ?=>
    val y = x + 1
    y

  xs.map {
    x =>
    val y = x * x
    y + y
  }

  xs.map { x =>
    val y = x * x
    if y >= 0 then
      val z = y + y
      println(z)
    y + 1
  }

  println(f(2) + g)

  (new Test2).foo
  (new Test3).foo

  var x = 1
  while
    x += 1
    val y = x
    println(y)
    x < 10
  do ()

class Test2 with self: Test2 =>
  def foo(x: Int) =
    if x < 0 then throw
      val ex = new AssertionError()
      ex
    x

  val x =
    new Test2 {
      override def foo(x: Int) = 2
    }
  end x
end Test2

class Test3 with
  self =>
  def foo = 1

class Test4 with { val x = 5 }

import collection.mutable.HashMap

class Coder(words: List[String]) with

  class Foo with
    println()
  end Foo

  class Bar

  (2 -> "ABC",  new ArrowAssoc('3') -> "DEF")

  private val mnemonics = Map(
      '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
      '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")

  ('1', "1") match
    case (digit, str) => true
    case _ => false

  ('1', "1") match
  case (digit, str) => true
  case _ => false

  try List(1, 2, 3) match
  case x :: xs => println(x)
  case Nil => println("Nil")
  catch
  case ex: java.io.IOException => println(ex)
  case ex: Throwable =>
    throw ex
  end try

  /** Invert the mnemonics map to give a map from chars 'A' ... 'Z' to '2' ... '9' */
  private val charCode0: Map[Char, Char] =
    mnemonics
      .withFilter {
        case (digit, str) => true
        case _ => false
      }
      .flatMap {
        case (digit, str) => str map (ltr => ltr -> digit)
      }
end Coder

object Test22 with
  def foo: Int = 22