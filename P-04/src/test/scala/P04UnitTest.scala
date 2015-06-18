import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}

object P04UnitTest extends Properties("P-04") {

  val p04 = new P04

  property("length of list") = forAll { list: List[Int] =>
    p04.length(list) == list.length
  }
}
