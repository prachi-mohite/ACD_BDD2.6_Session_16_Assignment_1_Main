 //Primary constructor which takes two parameters 1. Numerator 2. Denominator and returns the Rational number
  class Rational(n: Int, d: Int) {

    def this(n: Int) = this(n, 1)    // auxiliary constructors if we have any number instead of rational number
   //finding gcd of two numbers will help in Rational Methods
    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
    private val g = gcd(n, d)

    val numer: Int = n / g
    val denom: Int = d / g

    // All possibilities listed down as a part of method overloading.

   //Addition of Two Rational Numbers
    def +(that: Rational): Rational =
      new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

   //Addition of Two Integer Numbers
   def +(that: Int): Rational = this + new Rational(that)

   //Subtraction of Two Rational Numbers
    def -(that: Rational): Rational =
      new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

   //Subtraction of Two Integer Numbers
   def -(that: Int): Rational = this - new Rational(that)

   //Multiplication of Two Rational Numbers
    def *(that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)

   //Multiplication of Two Integer Numbers
   def *(that: Int): Rational = this * new Rational(that)

   //Division of two Rational Number
    def /(that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)

   //Division of two Integer Number
   def /(that: Int): Rational = this / new Rational(that)

   //display Rational Number
    override def toString() = numer+"/"+denom
}
