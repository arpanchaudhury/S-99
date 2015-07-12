object P31 {

	implicit class RichInt(val value: Int) extends AnyVal {
		def isPrime: Boolean = {
			if (value <= 1) false
			else if (value <= 3) true
			else (2 to value / 2).foldLeft(true)((result, divisor) => result && (value % divisor != 0))
		}
	}
}