import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}

object P01UnitTest extends Properties("P-01") {

   val p02 = new P02

  property("penultimate of non-empty list") = forAll { list: List[Int] =>
    (list.size > 1) ==> (p02.penultimate(list) == list.reverse(1))
  }

  val emptyListGenerator = Gen.oneOf(List[Int](), List[Boolean](), List[String]())

  property("penultimate of empty list") = forAll(emptyListGenerator) { list =>
    throws(classOf[Error]) (p02.penultimate(list))
  }

  property("penultimate of empty list") = forAll { value: Int =>
  	val singleElementList = List(value)
    throws(classOf[Error]) (p02.penultimate(singleElementList))
  }
}
