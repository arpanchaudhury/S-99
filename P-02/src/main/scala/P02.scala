class P02 {

	def penultimate[T](list: List[T]): T = list match {
		case (_ :: Nil) | Nil	=> throw new Error("No Such Element")
		case e1 :: e2 :: Nil 	=> e1
		case e1 :: e2 :: rest 	=> penultimate(list.tail)
	}

}