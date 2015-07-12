import org.specs2._

class P31UnitTest extends Specification { def is = s2"""

  This is a specification to check isPrime method

  isPrime method
      returns true if number is prime                   $e1
      returns false if number is not prime				$e2
														"""

	import P31._

	def e1 = 7.isPrime must beTrue

	def e2 = 9.isPrime must beFalse
	
}