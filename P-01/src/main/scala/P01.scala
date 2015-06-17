class P01 {

	def last[T](list: List[T]): T = list match {
		case Nil 		=> throw new Error("No Such Element")
		case x :: Nil 	=> x
		case x :: xs 	=> last(xs)
	}

}