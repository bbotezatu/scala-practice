object upto extends App{

	//Takes two arguments: start and end

	def upto (start:Int, end:Int) : List[Int] = {
		start match{
			case start if start>end => Nil 
			case _ => start :: upto(start+1, end)
		}
	}
	
	val start = args(1).toInt
	val end = args(2).toInt
	
	println(upto(start, end))

	
}