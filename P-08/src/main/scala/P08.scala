class P08 {

	def compress[T](list: List[T]): List[T] = list match {
		case Nil 		=> Nil
		case x :: xs 	=> x :: compress(list.dropWhile(_ == x))
	}

}