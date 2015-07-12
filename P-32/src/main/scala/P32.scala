class P32 {

	def gcd(a: Int, b: Int): Int = {
		if(b == 0) return a
		else gcd(b, a % b)
	}
	
}