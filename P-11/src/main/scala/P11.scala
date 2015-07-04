class P11 {

	def encodeModified[T](list: List[T]): List[Any] = pack(list).map(
		list => 
			if (list.length == 1) list.head
			else (list.length, list.head)
	)

	private def pack[T](list: List[T]): List[List[T]] = 
		if(list.isEmpty) Nil
		else list.span(_ == list.head) match { case (initial, rest) => initial :: pack(rest)}

}