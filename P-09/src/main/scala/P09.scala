class P09 {

	def pack[T](list: List[T]): List[List[T]] = 
		if(list.isEmpty) Nil
		else list.span(_ == list.head) match { case (initial, rest) => initial :: pack(rest)}
}