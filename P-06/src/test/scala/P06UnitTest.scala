import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}

object P06UnitTest extends Properties("P-06") {

  val p06 = new P06

  property("check if non empty list is palindrome") = forAll { list: List[Int] =>
  	list.nonEmpty ==>
    	(p06.isPalindrome(list ::: list.reverse) && p06.isPalindrome(list ::: list.reverse.tail))
  }

  val emptyListGenerator = Gen.oneOf(List[Int](), List[Boolean](), List[String]())


  property("check if empty list is palindrome") = forAll(emptyListGenerator) { list =>
  	p06.isPalindrome(list ::: list.reverse)
  }
}
