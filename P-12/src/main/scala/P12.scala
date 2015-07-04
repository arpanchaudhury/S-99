class P12 {

	def decode[T](list: List[(Int, T)]): List[T] = (list.map {
		case (occurrence, element) => 
			for(i <- 1 to occurrence) yield element
	}).flatten

}