package S99

/**
 * Created by kasonchan on 10/20/15.
 */
object S49 extends App {

  //  5 Problem 49
  //  (**) Gray codes.
  //  An n-bit Gray code is a sequence of n-bit strings constructed according to
  //  certain rules. For example,
  //  n = 1: C(1) = ['0','1'].
  //  n = 2: C(2) = ['00','01','11','10'].
  //  n = 3: C(3) = ['000','001','011','010',´110´,´111´,´101´,´100´].
  //  Find out the construction rules and write a predicate with the following specification:
  //  gray(N,C) :- C is the N-bit Gray code
  //  Can you apply the method of "result caching" in order to make the predicate
  //  more efficient, when it is to be used repeatedly?
  //  Example in Haskell:
  //  P49> gray 3
  //  ["000","001","011","010","110","111","101","100"]

  def gray(n: Int): List[String] =
    if (n == 0) List("")
    else {
      val lower = gray(n - 1)
      (lower map {
        "0" + _
      }) ::: (lower.reverse map {
        "1" + _
      })
    }

  println(gray(1))
  println(gray(2))
  println(gray(3))

}