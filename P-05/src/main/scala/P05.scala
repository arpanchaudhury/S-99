class P05 {

	def reverse[T](list: List[T]): List[T] = list match {
		case Nil | List(_)	=> list
		case x :: xs		=> reverse(list.tail) :+ list.head
	}

}