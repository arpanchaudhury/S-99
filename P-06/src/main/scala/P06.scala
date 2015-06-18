class P06 {

	def isPalindrome[T](list: List[T]): Boolean = {
		val mid = list.length / 2
		list.take(mid) == list.takeRight(mid).reverse
	}	

}