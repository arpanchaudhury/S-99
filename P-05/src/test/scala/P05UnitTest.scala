import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}

object P05UnitTest extends Properties("P-05") {

  val p05 = new P05

  property("reverse of list") = forAll { list: List[Int] =>
    p05.reverse(list) == list.reverse
  }
}
