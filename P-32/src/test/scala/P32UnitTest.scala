import org.specs2._

class P32UnitTest extends Specification { def is = s2"""

  This is a specification to check gcd method

  gcd method
      returns true if number is prime                   $e1
      returns false if number is not prime				$e2
														"""

	val p32 = new P32

	def e1 = p32.gcd(7, 21) === 7

	def e2 = p32.gcd(4, 9) === 1
	
}