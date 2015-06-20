class P10 {

	def encode[T](list: List[T]): List[(Int, T)] = pack(list).map(list => (list.length, list.head))

	private def pack[T](list: List[T]): List[List[T]] = 
		if(list.isEmpty) Nil
		else list.span(_ == list.head) match { case (initial, rest) => initial :: pack(rest)}

}