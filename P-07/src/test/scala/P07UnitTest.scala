import org.specs2._

class P07UnitTest extends Specification { def is = s2"""

    This is a specification to check flatten method

    flatten method
      returns flattened list                           $e1
      returns Nil when list is empty                   $e2"""

	val p07 = new P07

	def e1 = p07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8)

	def e2 = p07.flatten(List.empty) must be empty

}
