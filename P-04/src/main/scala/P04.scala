class P04 {

	def length[T](list: List[T]): Int = {
		def iterate(list: List[T], iteration: Int): Int = {
			if(list.isEmpty) iteration
			else iterate(list.tail, iteration + 1)
		}
		iterate(list, 0)
	}

}