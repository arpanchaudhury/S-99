import org.specs2._

class P10UnitTest extends Specification { def is = s2"""

  This is a specification to check encode method

  encode method
      returns encodeed list                             $e1
      returns Nil if input list is empty				$e2
      do not remove non consecutive repeatations		$e3 
														"""

	val p10 = new P10

	def e1 = p10.encode(List(1, 1, 2, 2, 2, 3, 5, 7, 7)) === List((2, 1), (3, 2), (1, 3), (1, 5), (2, 7))

	def e2 = p10.encode(List.empty) must be empty

	def e3 = p10.encode(List(1, 1, 2, 1, 1, 1)) === List((2, 1), (1, 2), (3, 1))
}
