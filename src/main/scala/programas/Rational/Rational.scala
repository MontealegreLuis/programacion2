class Rational (n: Int, d: Int) {
    private val divisor = gcd(n.abs, d.abs)
    val numerator = n /divisor
    val denominator = d / divisor
    def add(b: Rational): Rational= {
      new Rational(numerator * b.denominator + denominator * b.numerator,
                    denominator * b.denominator)
                  }
        def subtract(b: Rational): Rational= {
            new Rational(numerator * b.denominator - denominator * b.numerator,
                          denominator * b.denominator)
                        }
        def multiply(b: Rational): Rational= {
            new Rational(numerator * b.numerator, denominator * b.denominator)
                        }
        def divide(b: Rational): Rational= {
            new Rational(numerator * b.denominator, denominator * b.numerator)
                        }
        private def gcd(a: Int, b: Int): Int = {
            if (b == 0) {
              a
          } else {
            gcd(b, a % b)
                        }
            }
      }
