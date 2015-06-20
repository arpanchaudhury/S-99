import org.specs2._

class P09UnitTest extends Specification { def is = s2"""

  This is a specification to check pack method

  pack method
      returns packed list                           $e1
      returns Nil if input list is empty			$e2
      pack non consecutive repeatations separately	$e3
													"""

	val p09 = new P09

	def e1 = p09.pack(List(1, 1, 5, 5, 3)) === List(List(1, 1), List(5, 5), List(3))

	def e2 = p09.pack(List.empty) must be empty

	def e3 = p09.pack(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) ===
				List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d"), List("e", "e", "e", "e"))

}
