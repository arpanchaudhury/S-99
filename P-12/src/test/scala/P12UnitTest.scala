import org.specs2._

class P12UnitTest extends Specification { def is = s2"""

  This is a specification to check decode method

  decode method
      returns decodeed list                     		$e1
      returns Nil if input list is empty				$e2
														"""

	val p12 = new P12

	def e1 = p12.decode(List((2, 1), (3, 2), (1, 3), (1, 5), (2, 7))) === List(1, 1, 2, 2, 2, 3, 5, 7, 7)

	def e2 = p12.decode(List.empty) must be empty
	
}
