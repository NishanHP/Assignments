object main extends App {
  import scala.math.Numeric.Implicits.infixNumericOps;

  var a: Int = 2;
  var b: Int = 3;
  var c: Int = 4;
  var d: Int = 5;
  var k: Float = 4.3;

  // a)
  b -= 1;
  d -= 1;
  println(b * a + c * d)

  // b)
  a += 1;
  println(a);

  // c) cannot be run since g isn't declared
  // d)
  c += 1;
  println(c);

  // e)
  a += 1;
  c = c * a;
  println(c);
}
