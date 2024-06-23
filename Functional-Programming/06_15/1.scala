//1

object evalExpress extends App {
  var i, j, k = 2;
  var m, n = 5;

  var g: Float = 12.0f
  var f: Float = 4.0f
  var c: Char = ' '

  f = 12.0f;
  g = 4.0f;
  c = 'X'

  println(k + 12 * m);
  println(m / j);
  println(n % j);
  println(m / j * j);
  println(f + 10 * 5 + g);
  i += 1;
  println(i * n);
}

//scala doesn't have ++ or -- operator
//but can be implement using implicit operator class
//But java has inbuild unary operators like ++ and --
