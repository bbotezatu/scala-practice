object fib extends App{
	
	//Takes one arg: the fib number
	
	def fib(x:Int) : Int = {
		x match{
			case 0 | 1 => x
			case _ => fib(x-1) + fib(x-2)
		}
	}
	
	val p = args(1).toInt
	println()
	println(fib(p))
	
}