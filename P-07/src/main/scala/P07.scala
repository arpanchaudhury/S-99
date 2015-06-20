class P07 {

	def flatten(list: List[Any]): List[Any] = list match {
		case Nil 					=> Nil
		case (x: List[Any]) :: xs	=> flatten(x) ::: flatten(xs)
		case x :: xs 				=> x :: flatten(xs)
	}

}