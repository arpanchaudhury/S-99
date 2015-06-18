import org.scalacheck.Gen
import org.scalacheck.Gen._
import org.scalacheck.Arbitrary
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators, throws}
import java.util.NoSuchElementException

object P03UnitTest extends Properties("P-03") {

  val p03 = new P03

  val nonEmptyListGenerator = for {
	list 	<- Arbitrary.arbitrary[List[Int]]
	index	<- Gen.choose(0, list.size - 1)
  } yield (index, list)

  property("nth element of non-empty list") = forAll(nonEmptyListGenerator) { 
  	case (index: Int, list: List[Int]) => 
  		list.nonEmpty ==> (p03.nth(index, list) == list(index))
  }

  val emptyListGenerator = for {
  	index	 	   <- Arbitrary.arbitrary[Int]
  	emptyList  <- Gen.oneOf(List[Int](), List[Boolean](), List[String]())
  } yield (index, emptyList)

  property("nth element of empty list") = forAll(emptyListGenerator) { 
  	case (index, list) => throws(classOf[NoSuchElementException]) (p03.nth(index, list))
  }

  val listGeneratorWithIndexOutOfBound = for {
    list  <- Arbitrary.arbitrary[List[Int]]
    if list.nonEmpty
    index <- Arbitrary.arbitrary[Int]
    if !(0 until list.size).contains(index)
  } yield (index, list)

  property("index out of bound") = forAll(listGeneratorWithIndexOutOfBound) { 
    case (index, list) => throws(classOf[IndexOutOfBoundsException]) (p03.nth(index, list))
  }
}
