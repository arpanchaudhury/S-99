import java.util.NoSuchElementException

class P03 {

	def nth[T](index: Int, list: List[T]): T = list match {
		case Nil 	 					=> throw new NoSuchElementException("No Such Element")
		case x :: Nil if (index != 0)	=> throw new IndexOutOfBoundsException("Index Out Of Bound")
		case x :: xs 					=> if (index == 0) x else nth(index - 1, xs) 
	}

}
