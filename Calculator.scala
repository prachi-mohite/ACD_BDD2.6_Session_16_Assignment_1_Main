object Calculator {
  def main(args: Array[String]): Unit = {

    val x = new Rational(2, 3)
    val y = new Rational(3, 4)

    println("The first rational number is " + x.toString())
    println("The second rational number is " + y.toString())

    val a = x + y
    println("Result: addition of two Rational Number : " + a.toString())

    val b = x*y
    println("Result: multiplication of two Rational Number : " + b.toString())

    val c = x - y
    println("Result: subtraction of two Rational Number : " + c.toString())

    val z = x/y
    println("esult: division of two Rational Number : " + z.toString())


    val x1 = new Rational(8)


    val a1 = x1 + y
    println("Result: addition of Rational & Integer Number : " + a1)

    val b1 = x1*y
    println("Result: multiplication of Rational &  Integer Number : " + b1)

    val c1 = x1 - y
    println("Result: subtraction of Rational &  Integer Number : " + c1)

    val z1 = x1/y
    println("esult: division of Rational &  Integer Number : " + z1)

  }
}
