import org.specs2._

class P08UnitTest extends Specification { def is = s2"""

  This is a specification to check compress method

  compress method
      returns compressed list                           $e1
      returns Nil if input list is empty				$e2
      do not remove non consecutive repeatations		$e3 
														"""

	val p08 = new P08

	def e1 = p08.compress(List(1, 1, 2, 2, 2, 3, 5, 7, 7)) === List(1, 2, 3, 5, 7)

	def e2 = p08.compress(List.empty) must be empty

	def e3 = p08.compress(List(1, 1, 2, 1, 1, 1)) === List(1, 2, 1)
}
