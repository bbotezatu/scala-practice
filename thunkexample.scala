object thunkexample extends App{
	
	//example of a thunk, also called a 'delayed function'
	
	def delayedRandom(p : () => Double) : Unit = {
		val a = p()
		val b = p()
		val ret = a == b
		
		
		println("value " + a + "  equal to value " + b + ": " + ret)
	}
	
	delayedRandom(() => Math.random())

	
}