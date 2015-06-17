import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}

object P01UnitTest extends Properties("P-01") {

  val p01 = new P01

  property("last of non-empty list") = forAll { list: List[Int] =>
    list.nonEmpty ==> (p01.last(list) == list.last)
  }

  val emptyListGenerator = Gen.oneOf(List[Int](), List[Boolean](), List[String]())

  property("last of empty list") = forAll(emptyListGenerator) { list =>
    throws(classOf[Error]) (p01.last(list))
  }
}
