import org.specs2._

class P11UnitTest extends Specification { def is = s2"""

  This is a specification to check encodeModified method

  encodeModified method
      returns encodeModifieded list                             $e1
      returns Nil if input list is empty				$e2
      do not remove non consecutive repeatations		$e3 
														"""

	val p11 = new P11

	def e1 = p11.encodeModified(List(1, 1, 2, 2, 2, 3, 5, 7, 7)) === List((2, 1), (3, 2), 3, 5, (2, 7))

	def e2 = p11.encodeModified(List.empty) must be empty

	def e3 = p11.encodeModified(List(1, 1, 2, 1)) === List((2, 1), 2, 1)
}
